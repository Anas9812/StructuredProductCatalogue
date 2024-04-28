package ProductCatalogueProject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ProductCatalogueProject.Exception.ProductNotFoundException;
import ProductCatalogueProject.Repo.Productrepo;
import ProductCatalogueProject.entity.Product;

@Service
public class ProductService implements ProductINF {

	@Autowired
	Productrepo repo;
	

	// TO SAVE THE PRODUCT
	@Override
	public String Saveproduct(Product product) {

		try {
			repo.save(product);
			return "Product Added Successfully: " + product.getId();
			
		} catch (Exception e) {
			// IF PRODUCT IS NOT ADD EXECUTE RETURN STATEMENT
			System.out.println(e);
			return "Product is not added";
		}
	}

	
	// TO FETCH ALL THE PRODUCT
	@Override
	public List<Product> getAllProducts() {
		List<Product> pro = repo.findAll();
		return pro;
	}

	// TO FETCH THE PRODUCT THROUGH ITS PAGENUMBER AND SORTING
	@Override
	public List<Product> fetch(int pageNumber, int pageSize) {

		try {
			//PRODUCT FETCH BY ITS PAGENUMBER AND PAGESIZE AND PRODUCT SORT WITH ITS ID 
			Pageable pageable = PageRequest.of(pageNumber, pageSize,
					Sort.by("id").ascending());
			Page<Product> page = repo.findAll(pageable);
			List<Product> product = page.getContent();
			return product;
		} catch (Exception e) {
			System.out.println(e);

		}

		return null;
	}

	// TO DELETE THE PRODUCT TRHORUGH ITS ID
	@Override
	public List<Product> delete(Long id) {

		Optional<Product> product = repo.findById(id);
		// PRODUCT DELETE BY ITS ID IF IT IS PRESENT
		if (product.isPresent()) {
			repo.deleteById(id);
			return repo.findAll();
		} else {
			throw new ProductNotFoundException("Product Not Found");
		}
	}

	// UPDATE PRODUCT

	@Override
	public List<Product> update(Product product) {

		try {
			repo.save(product);
			return (List<Product>) repo.findById(product.getId()).get();
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;

	}

	// FETCH PRODUCT BY NAME
	@Override
	public List<Product> findByName(String name) {
		
		return repo.findByName(name);
	}


	// TO FIND BY PRODUCT ID
	@Override
	public Optional<Product> findById(long id) {
		return repo.findById(id);
	}


	

	





	

	




	
	

}
