package com.example.spqr.serviceImpl;

import java.util.List;

import com.example.spqr.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spqr.IService.IUserService;
import com.example.spqr.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public AppUser createUser(AppUser appUser) {
		return userRepository.save(appUser);
	}

	@Override
	public void deleteUser(String id) {
	userRepository.deleteById(id);
		
	}

	@Override
	public AppUser updateUser(AppUser appUser) {
		return userRepository.save(appUser);
	}

	@Override
	public AppUser getUser(String id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<AppUser> getAllUsers() {
		return userRepository.findAll();
	}
	
	
}
