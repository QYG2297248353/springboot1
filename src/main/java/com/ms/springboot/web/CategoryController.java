package com.ms.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ms.springboot.dao.CategoryDAO;
import com.ms.springboot.pojo.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;

//	查并分页
	@RequestMapping("/listCategory")
	public String listCategory(Model m, @RequestParam(value = "start", defaultValue = "0") int start,
			@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
		start = start < 0 ? 0 : start;
		Sort sort = new Sort(Sort.Direction.DESC, "id");
		Pageable pageable = new PageRequest(start, size, sort);
		Page<Category> page = categoryDAO.findAll(pageable);
		m.addAttribute("page", page);
		return "listCategory";
	}

//	增加
	@RequestMapping("/addCategory")
	public String addCategory(Category c) throws Exception {
		categoryDAO.save(c);
		return "redirect:listCategory";
	}

//	删除
	@RequestMapping("/deleteCategory")
	public String deleteCategory(Category c) throws Exception {
		categoryDAO.delete(c);
		return "redirect:listCategory";
	}

//	改
	@RequestMapping("/updateCategory")
	public String updateCategory(Category c) throws Exception {
		categoryDAO.save(c);
		return "redirect:listCategory";
	}

//	改前获取
	@RequestMapping("/editCategory")
	public String editCategory(int id, Model m) throws Exception {
		Category c = categoryDAO.getOne(id);
		m.addAttribute("c", c);
		return "editCategory";
	}

}
