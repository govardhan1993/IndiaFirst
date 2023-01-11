package com.spring.project.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.model.User;

public interface UserRepository extends JpaRepository<User, Serializable>{

}
