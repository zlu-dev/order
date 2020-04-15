package com.zlu.order.order.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "status")
    private String status;
}
