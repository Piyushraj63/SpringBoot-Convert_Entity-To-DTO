package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;
import com.crud.model.User;
import com.crud.repository.UserRepository;
import com.crud.webDTO.UserLocationDto;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public List<UserLocationDto> getAllUserLocation(){
		return this.userRepository.findAll()
				.stream().map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}
	
	public UserLocationDto convertEntityToDto(User user) {		
		UserLocationDto userLocationDto=new UserLocationDto();
		userLocationDto.setUserId(user.getId());
		userLocationDto.setEmail(user.getEmail());
		userLocationDto.setPlace(user.getLocation().getPlace());
		userLocationDto.setLatitude(user.getLocation().getLatitude());
		userLocationDto.setLongitude(user.getLocation().getLongitude());
		return userLocationDto;		
	}


}
