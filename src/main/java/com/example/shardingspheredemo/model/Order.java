package com.example.shardingspheredemo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_order")
public class Order {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    private Long order_id;
    private String name;
    private Date create_time;
    private Date update_time;
}
