package ProductCatalogueProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProductCatalogueProject.entity.Rating;

@Repository
public interface Ratingrepo extends JpaRepository<Rating, Long> {

	
}
