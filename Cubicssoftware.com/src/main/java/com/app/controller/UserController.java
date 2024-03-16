package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.UserService;
import com.app.dto.UserDto;
import com.app.pojos.User;

@RestController
@RequestMapping("/user")
public class UserController 
{
 @Autowired
 private UserService usersevice;
 
 @PostMapping("/registeruser")
 public ResponseEntity<User> registerUsers(@RequestBody User user)
 {
	return ResponseEntity.ok(usersevice.ResisterUser(user));
	 
 }
 
 @PostMapping("/loginuser")
 public ResponseEntity<UserDto> loginUsers(@RequestBody UserDto userdto)
 {
	return ResponseEntity.ok(usersevice.loginUser(userdto));
	 
 }
}
