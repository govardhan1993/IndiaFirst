package com.spring.project.repository;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable>{
	@Query(value="select email from user s where email=?", nativeQuery = true)
	public User findByEmailId(String email);
	

}
