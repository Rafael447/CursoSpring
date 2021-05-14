package com.aplicacaoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacaoweb.demo.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
