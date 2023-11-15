package com.CakeWalk.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CakeWalk.Entity.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{

}
