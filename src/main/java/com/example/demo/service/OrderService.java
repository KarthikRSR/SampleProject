package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.OrderEntity;
import com.example.demo.model.OrderRequest;
import com.example.demo.model.OrderResponse;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderResponse getOrderDetails(OrderRequest orderRequest) {

        Optional<OrderEntity> optionalOrder = orderRepository.getAllOrderDetails(orderRequest.getStart_date(),
                orderRequest.getEnd_date());

                if (optionalOrder.isPresent()) {
                    
                    OrderResponse orderResponse = new OrderResponse();

                    orderResponse.setMessage("Success");
                    orderResponse.setSuccess(true);
                }

                


    }

}
