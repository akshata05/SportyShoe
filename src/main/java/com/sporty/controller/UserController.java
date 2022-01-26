package com.sporty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sporty.dao.UserDao;

@Controller
public class UserController {
	@Autowired
	private UserDao userDao;
	
@RequestMapping("/users")
	public String List(Model model) {

		model.addAttribute("users", userDao.userList());
		return "userView";
	}

@RequestMapping("/search")
public String Search(@RequestParam("name") String name,Model model) {

	model.addAttribute("users", userDao.searchList(name));
	return "displaySearch";
}

@RequestMapping("/searchUser")
public String SearchUser(Model model) {

	return "searchUser";
}
}
