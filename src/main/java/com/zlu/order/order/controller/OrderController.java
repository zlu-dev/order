package com.zlu.order.order.controller;

import com.zlu.order.order.command.CreateOrderCommand;
import com.zlu.order.order.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("order")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private void create(@Valid @RequestBody CreateOrderCommand command) {

            orderService.save(command);

    }

    @GetMapping
    private ResponseEntity findAll(Pageable pageable){
       return ResponseEntity.ok(orderService.findAll(Pageable.unpaged()));
    }

    @GetMapping("/{id}")
    private ResponseEntity<String> findOrderById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(orderService.findById(id).toString());
    }

}
