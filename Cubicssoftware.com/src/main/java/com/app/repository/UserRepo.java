package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dto.UserDto;
import com.app.pojos.User;

public interface UserRepo extends JpaRepository<User, Long>
{
User findbyemailandpassword(String email,String password);
}
