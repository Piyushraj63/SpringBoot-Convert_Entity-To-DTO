package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.crud.service.UserService;
import com.crud.webDTO.UserLocationDto;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/user-location")
	public List<UserLocationDto> getAllUserLocation(){
		return userService.getAllUserLocation();    }  
	
}
