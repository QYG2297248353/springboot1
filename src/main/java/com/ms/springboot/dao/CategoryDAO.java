package com.ms.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.springboot.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{
	 
}