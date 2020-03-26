package com.projectSpring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projectSpring.entities.Order;
import com.projectSpring.entities.User;
import com.projectSpring.repositories.OrderRepository;
import com.projectSpring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository OrderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "99999999", "123456");
		User u2 = new User(null, "Alex Green", "Alex@gmail.com", "99999999", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-06-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		OrderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}

}
