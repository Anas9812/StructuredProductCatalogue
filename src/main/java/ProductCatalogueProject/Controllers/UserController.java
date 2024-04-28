package ProductCatalogueProject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProductCatalogueProject.Service.UserService;
import ProductCatalogueProject.entity.SecurityUser;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@PostMapping("/register")
	public String register(@RequestBody SecurityUser user) {
		userservice.saveuser(user);
		return "Register Successfully";
		
	}

	
}
