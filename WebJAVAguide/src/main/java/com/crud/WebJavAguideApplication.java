package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.model.Location;
import com.crud.model.User;
import com.crud.repository.LocationRepository;
import com.crud.repository.UserRepository;

@SpringBootApplication
public class WebJavAguideApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(WebJavAguideApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository=null;

	@Autowired
	private LocationRepository locationRepository=null;
	
	
	@Override
	public void run(String... args) throws Exception {

		Location location=new Location();
	    location.setPlace("Mumbai");
	    location.setDescription("Mumbai is worst place to live");
	    location.setLatitude(23.32);
	    location.setLongitude(443.343);
	    locationRepository.save(location);
	    
	    User user1=new User();
	    user1.setEmail("VishnuSingh@gmail.com");
	    user1.setFirstName("Vishnu");
	    user1.setLastName("Singh");
	    user1.setPassword("Pushpa I Hate Tears");
	    user1.setLocation(location);
	    userRepository.save(user1);	 
	    
	    User user2=new User();
	    user2.setEmail("NJiva@ram");
	    user2.setFirstName("Jiva");
	    user2.setLastName("Singh");
	    user2.setPassword("Pushpa I Hate Tears");
	    user2.setLocation(location);
	    userRepository.save(user2);	 
	    
	    
	}

}
