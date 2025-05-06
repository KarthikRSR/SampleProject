package com.example.demo.model;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private int id;

    @Column(name = "orderid")
    private String orderid;

    @Column(name = "ordered_date")
    private LocalDate ordered_date;

    public OrderEntity(int id, String orderid, LocalDate ordered_date) {
        this.id = id;
        this.orderid = orderid;
        this.ordered_date = ordered_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public LocalDate getOrdered_date() {
        return ordered_date;
    }

    public void setOrdered_date(LocalDate ordered_date) {
        this.ordered_date = ordered_date;
    }

}
