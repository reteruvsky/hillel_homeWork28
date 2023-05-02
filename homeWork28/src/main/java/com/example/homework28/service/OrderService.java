package com.example.homework28.service;

import com.example.homework28.entity.Order;
import com.example.homework28.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order getById(Long id) {
        return orderRepository.findById(id).get();
    }

    public List<Order> getAll() {
        return (List<Order>) orderRepository.findAll();
    }

    public void add(Order order) {
        orderRepository.save(order);
    }

    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
