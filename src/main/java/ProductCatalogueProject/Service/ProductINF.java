package ProductCatalogueProject.Service;

import java.util.List;
import java.util.Optional;

import ProductCatalogueProject.entity.Product;

public interface ProductINF {

	// TO SAVE PRODUCT DATA	
	String Saveproduct(Product product);

	// TO FETCH ALL PRODUCTS
	Object getAllProducts();

	// TO FETCH PRODUCT THROUGH ITS PAGINATION AND SORTING
	Object fetch(int pageNumber, int pageSize);

	// TO DELETE THE PRODUCTS IF ITS PRESENT
	Object delete(Long id);

	// TO UPDATE THE PRODUCT
	List<Product> update(Product product);

	// TO FETCH THE PRODUCT BY ITS NAME
	List<Product> findByName(String name);


	// TO FETCH THE PRODUCT BY ITS ID IF ITS PRESENT
	Optional<Product> findById(long id);


	

	

	


	

	



	

	










}
