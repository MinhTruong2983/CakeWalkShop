package com.CakeWalk.Dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.CakeWalk.Entity.Cakes;

public interface CakesDao extends JpaRepository<Cakes, Integer>{
	
	//Bài5
		Page<Cakes> findAllByNameLike(String keywords, Pageable page);
		

}
