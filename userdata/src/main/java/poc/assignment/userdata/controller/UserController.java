package poc.assignment.userdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import poc.assignment.userdata.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	
}
