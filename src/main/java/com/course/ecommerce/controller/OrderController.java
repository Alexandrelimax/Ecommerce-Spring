package com.course.ecommerce.controller;

import com.course.ecommerce.entity.Order;
import com.course.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> orders = orderService.findAll();
        return new ResponseEntity<>(orders, HttpStatus.OK);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Integer id){
        Order order = orderService.findById(id);
        if(order != null){
            return new ResponseEntity<>(order, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
