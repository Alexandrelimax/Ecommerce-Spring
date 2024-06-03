package com.course.ecommerce.service;

import com.course.ecommerce.entity.Order;
import com.course.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order>findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Integer id){
        return orderRepository.findById(id).orElse(null);
    }
}
