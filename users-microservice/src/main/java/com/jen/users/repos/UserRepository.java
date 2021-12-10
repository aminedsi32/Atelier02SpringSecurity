package com.jen.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jen.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}