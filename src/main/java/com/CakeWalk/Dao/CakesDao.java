package com.CakeWalk.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CakeWalk.Entity.Cakes;

public interface CakesDao extends JpaRepository<Cakes, Integer>{

}
