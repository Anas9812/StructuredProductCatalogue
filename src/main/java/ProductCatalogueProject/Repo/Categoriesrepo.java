package ProductCatalogueProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProductCatalogueProject.entity.categories;

@Repository
public interface Categoriesrepo extends JpaRepository<categories, Integer> {

}
