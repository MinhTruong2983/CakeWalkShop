package com.CakeWalk.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CakeWalk.Entity.Orders;

public interface OrdersDao extends JpaRepository<Orders, Integer> {

}
