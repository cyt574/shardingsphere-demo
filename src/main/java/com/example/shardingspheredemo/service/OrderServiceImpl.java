package com.example.shardingspheredemo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shardingspheredemo.mapper.OrderMapper;
import com.example.shardingspheredemo.model.Order;
import com.example.shardingspheredemo.model.OrderDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService{

    @Autowired
    OrderMapper orderMapper;
    @Override
    public Object save(OrderDTO orderDTO) {
        Order order = new Order();
        BeanUtils.copyProperties(orderDTO, order);

        orderMapper.insert(order);
        return null;
    }
}
