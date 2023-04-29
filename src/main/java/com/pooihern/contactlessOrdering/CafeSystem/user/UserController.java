package com.pooihern.contactlessOrdering.CafeSystem.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserRepo userRepo;
	
	public UserController() {
		
	}
	
	public UserController(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	@GetMapping("/users")
	public List<UserEntity> retrieveAllUsers() {
		return userRepo.findAll();
	}
	
	@GetMapping("/users/{id}")
	public UserEntity findUser(@PathVariable Long id)
	{
		Optional<UserEntity> user = userRepo.findById(id);
		
		if (user.isEmpty())
			throw new UserNotFoundException("id: " + id);
		
		return user.get();
	}
	
	@PostMapping("/users")
	public UserEntity createUser(@RequestBody UserEntity user) {
		userRepo.save(user);
		return user;
	}
}
