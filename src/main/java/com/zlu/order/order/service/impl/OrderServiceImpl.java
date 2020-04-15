package com.zlu.order.order.service.impl;

import com.zlu.order.order.command.CreateOrderCommand;
import com.zlu.order.order.model.Order;
import com.zlu.order.order.repository.OrderRepository;
import com.zlu.order.order.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public void save(CreateOrderCommand command) {

        Order order = new Order();
        order.setUserId(command.getUserId());
        order.setStatus("PENDING");
        orderRepository.save(order);
    }

    @Override
    public Page<Order> findAll(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return orderRepository.findByOrderId(id);
    }
}
