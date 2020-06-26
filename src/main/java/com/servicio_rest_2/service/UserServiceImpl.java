package com.servicio_rest_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio_rest_2.model.User;
import com.servicio_rest_2.service.UserService;
import com.servicio_rest_2.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}
}
