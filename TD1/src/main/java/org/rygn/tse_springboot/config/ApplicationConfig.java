package org.rygn.tse_springboot.config;

import org.rygn.tse_springboot.components.Elfe;
import org.rygn.tse_springboot.interfaces.Vagabond;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.rygn.tse_spring")
public class ApplicationConfig {
	
	@Bean
	public Vagabond vagabond() {
		
		return new Elfe();
	}
}
