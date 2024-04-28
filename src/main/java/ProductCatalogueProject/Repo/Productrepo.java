package ProductCatalogueProject.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProductCatalogueProject.entity.Product;
import ProductCatalogueProject.entity.Rating;

@Repository
public interface Productrepo extends JpaRepository<Product, Long> {


	// JPA CUSTOM METHOD
	public List<Product> findByName(String name);



	
	
	
}
