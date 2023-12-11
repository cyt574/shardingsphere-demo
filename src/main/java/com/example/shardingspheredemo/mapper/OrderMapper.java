package com.example.shardingspheredemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shardingspheredemo.model.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Select("SELECT * from t_order where state = #{id}}")
    Order findById(@Param("id") Long id);

//    @Insert({"INSERT into t_order (order_id, name) values(#{order_id}, #{name})"})
 //   int insert(Order order);
}
