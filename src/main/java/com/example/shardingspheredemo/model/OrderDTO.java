package com.example.shardingspheredemo.model;

import lombok.Data;
import java.util.Date;

@Data
public class OrderDTO {
    private Long order_id;
    private String name;
    private Date create_time;
    private Date update_time;
}
