package com.zlu.order.order.service;

import com.zlu.order.order.command.CreateOrderCommand;
import com.zlu.order.order.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface OrderService {

    void save(CreateOrderCommand command);

    Page<Order> findAll(Pageable pageable);

    Optional<Order> findById(Long id);
}
