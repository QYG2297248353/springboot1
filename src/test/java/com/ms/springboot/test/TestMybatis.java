package com.ms.springboot.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ms.springboot.Application;
import com.ms.springboot.mapper.CategoryMapper;
import com.ms.springboot.pojo.Category;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMybatis {
	
	@Autowired
	CategoryMapper categoryMapper;
	
	@Test
	public void test() {
		List<Category> cs=categoryMapper.findAll();
		for (Category category : cs) {
			System.out.println("Name: "+category.getName());
		}
	}
}
