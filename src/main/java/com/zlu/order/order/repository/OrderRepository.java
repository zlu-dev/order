package com.zlu.order.order.repository;

import com.zlu.order.order.model.Order;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
    Optional<Order> findByOrderId(Long orderId);
}
