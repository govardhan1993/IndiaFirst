package com.spring.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value="select * from user where email=1?", nativeQuery = true)
	public User findByEmailId(String email);
	

}
