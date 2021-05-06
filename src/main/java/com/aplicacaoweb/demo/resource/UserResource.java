package com.aplicacaoweb.demo.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacaoweb.demo.entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserResource {
@GetMapping
	public ResponseEntity<User> findAll() {
		
		User i = new User(1L,"Rafael","00000000","000000000","00000000");
		return ResponseEntity.ok().body(i);

	}
}
