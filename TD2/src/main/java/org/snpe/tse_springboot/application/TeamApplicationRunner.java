package org.snpe.tse_springboot.application;

import dao.UserRepository;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TeamApplicationRunner implements ApplicationRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		User client1 = new User();
		client1.setName("client1");		
		this.userRepository.save(client1);
		
		User client2 = new User();
		client2.setName("client2");		
		this.userRepository.save(client2);
	}
}
