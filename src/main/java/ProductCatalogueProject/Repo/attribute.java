package ProductCatalogueProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProductCatalogueProject.entity.Attributes;

@Repository
public interface attribute  extends JpaRepository<Attributes, Integer>{

}
