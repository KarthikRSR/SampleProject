package com.example.demo.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

    @Query(value = "SELECT * from orders where ordered_date between :stard_date AND :end_date", nativeQuery = true)
    Optional<OrderEntity> getAllOrderDetails(LocalDate start_date, LocalDate end_date);

}
