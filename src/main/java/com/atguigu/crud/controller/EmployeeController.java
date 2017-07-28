package com.atguigu.crud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 处理员工CRUD请求
 * @author 孙思佳
 *
 */
@Controller
public class EmployeeController {
	@RequestMapping("/emps")
	public String getEmps(HttpServletRequest request, Model model){
		return "flash";
	}
}
