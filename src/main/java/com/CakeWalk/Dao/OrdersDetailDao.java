package com.CakeWalk.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CakeWalk.Entity.OrderDetail;

public interface OrdersDetailDao extends JpaRepository<OrderDetail, Integer>{

}
