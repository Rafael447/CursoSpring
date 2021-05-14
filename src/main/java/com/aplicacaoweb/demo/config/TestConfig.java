package com.aplicacaoweb.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aplicacaoweb.demo.entities.User;
import com.aplicacaoweb.demo.repositories.UserRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
@Autowired	
private UserRepository userRepository;

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	User u1 = new User (1L,"Rafael","CAMPOSRAFAEL28@GMAIL.COM","ASASDA","ASDASDAS");
	User u2 = new User (2L,"Rafael","0AAAAAA","SDFADSFSF","WWWWW");
	
	userRepository.saveAll(Arrays.asList(u1,u2));
}
}
