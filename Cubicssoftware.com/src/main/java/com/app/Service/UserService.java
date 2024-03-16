package com.app.Service;

import com.app.dto.UserDto;
import com.app.pojos.User;

public interface UserService 
{
 User ResisterUser(User user);
 UserDto loginUser(UserDto userdto);
}
