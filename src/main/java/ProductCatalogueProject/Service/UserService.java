package ProductCatalogueProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ProductCatalogueProject.Repo.Userrepo;
import ProductCatalogueProject.entity.SecurityUser;

@Service
public class UserService  implements UserDetailsService {

	@Autowired
	Userrepo repo;
	
	@Autowired
	PasswordEncoder encoder;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repo.findByUsername(username);
	}
	
	public SecurityUser saveuser(SecurityUser user) {
		// FOR ENCODE THE PASSWORD
		user.setPasscode(encoder.encode(user.getPasscode()));
		repo.save(user);
		return repo.findByUsername(user.getUsername());
	}

}
