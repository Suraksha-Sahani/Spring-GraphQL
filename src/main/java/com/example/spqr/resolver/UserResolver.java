package com.example.spqr.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spqr.IService.IUserService;
import com.example.spqr.model.AppUser;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;

@Component
public class UserResolver {
	
	@Autowired
	private IUserService userService;
	
	@GraphQLMutation(name="createUser")
	public AppUser createUser(@GraphQLArgument(name="details") AppUser appUser) {
		return userService.createUser(appUser);
	}
	
	@GraphQLQuery(name="getAllUser")
	public List<AppUser> getAllUser() {
		return userService.getAllUsers();
	}
	
	@GraphQLMutation(name="updateUser")
	public AppUser updateUser(@GraphQLArgument(name="details") AppUser appUser) {
		return userService.updateUser(appUser);
	}
	
	@GraphQLMutation(name="deleteUser")
	public Boolean deleteUser(@GraphQLArgument(name="userId") String id) {
		 userService.deleteUser(id);
		 return true;
	}
	
	@GraphQLQuery(name="getUser")
	public AppUser getUser(@GraphQLArgument(name="userId") String id) {
		return userService.getUser(id);
	}
	

}
