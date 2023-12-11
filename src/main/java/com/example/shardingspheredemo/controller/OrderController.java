package com.example.shardingspheredemo.controller;

import com.example.shardingspheredemo.model.OrderDTO;
import com.example.shardingspheredemo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    IOrderService orderService;
    @PostMapping("/submit")
    public Object submitOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.save(orderDTO);
    }
}
