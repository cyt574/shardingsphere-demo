package com.example.shardingspheredemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shardingspheredemo.model.Order;
import com.example.shardingspheredemo.model.OrderDTO;

public interface IOrderService extends IService<Order> {
    Object save(OrderDTO orderDTO);
}
