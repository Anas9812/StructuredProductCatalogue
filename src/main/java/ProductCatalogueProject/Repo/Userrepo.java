package ProductCatalogueProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ProductCatalogueProject.entity.SecurityUser;

public interface Userrepo extends JpaRepository<SecurityUser,Integer>{

	public SecurityUser findByUsername(String username);
}
