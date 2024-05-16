package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;


@Service
public class UserServiceImpl implements UserService{
	
 //fake User List
	List<User> list=List.of(
			new User(1111L,"Namrata","1234567890"),
			new User(2222L,"Shewata","0987654321")
			);

	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user->user.getUserID().equals(id)).findAny().orElse(null);
	} 
	

}
