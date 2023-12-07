package controller;

import java.util.List;

import org.rygn.tse_springboot.domain.User;
import org.rygn.tse_springboot.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	
	
	@Autowired
	private ZooService zooService;
	
	@GetMapping("/users")
	public List<User> allUsers() {
				
		return this.teamService.findAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User oneUser(@PathVariable Long id) {
				
		return this.teamService.findUser(id);
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		
		return this.teamService.createUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		
		this.teamService.deleteUser(id);
	}
	
	@PutMapping("/users/{id}")
	User replaceUser(@RequestBody User user, @PathVariable Long id) {

		User foundUser = this.teamService.findUser(id);
		
		if (user != null) {
			
			foundUser.setName(user.getName());
			
			foundUser = this.teamService.saveUser(foundUser);
		}
		
		return foundUser;
	}
}
