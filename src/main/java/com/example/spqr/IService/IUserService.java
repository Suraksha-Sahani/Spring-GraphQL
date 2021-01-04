package com.example.spqr.IService;

import java.util.List;

import com.example.spqr.model.AppUser;

public interface IUserService {
	
	public AppUser createUser(AppUser appUser);
	public void deleteUser(String id);
	public AppUser updateUser(AppUser appUser);
	public AppUser getUser(String id);
	public List<AppUser> getAllUsers();
	

}
