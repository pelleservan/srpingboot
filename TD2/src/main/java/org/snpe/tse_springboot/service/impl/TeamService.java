public package service;

import java.util.List;

import domain.User;

public interface TeamService {

	public List<User> findAllUsers();

	public User finduser(Long id);

	public User createUser(user user);

	public void deleteUser(Long id);

	public Animal saveUser(Animal foundUser);
    
}
