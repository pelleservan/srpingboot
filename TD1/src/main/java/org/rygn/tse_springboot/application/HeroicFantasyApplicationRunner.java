package org.rygn.tse_springboot.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import org.rygn.tse_springboot.components.HeroicFantasy;

@Component
@Profile("!test")
public class HeroicFantasyApplicationRunner implements ApplicationRunner {

	@Autowired
	private HeroicFantasy heroicFantasy;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println(heroicFantasy);
	}


}
