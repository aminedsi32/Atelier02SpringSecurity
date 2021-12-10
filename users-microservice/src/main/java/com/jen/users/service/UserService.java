package com.jen.users.service;

import java.util.List;

import com.jen.users.entities.Role;
import com.jen.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();

}
