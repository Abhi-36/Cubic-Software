package com.app.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.UserDto;
import com.app.pojos.User;
import com.app.repository.UserRepo;

@Service
@Transactional
public class UserServiceImpl implements UserService
{

	 @Autowired
	 private UserRepo userrepo;
	 
	 @Autowired
	 ModelMapper mapper= new ModelMapper();
	@Override
	public User ResisterUser(User user) {
		User user1=userrepo.save(user);
		return user1;
	}
	@Override
	public UserDto loginUser(UserDto userdto) {
		User user=userrepo.findbyemailandpassword(userdto.getEmail(),userdto.getPassword());
		return mapper.map(user, UserDto.class);
	}
	




}
