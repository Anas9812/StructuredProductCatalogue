package ProductCatalogueProject.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ProductCatalogueProject.Service.ProductINF;
import ProductCatalogueProject.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductINF service;

	// TO PRODUCT SAVE
	@PostMapping("/save")
	public String Saveproduct(@RequestBody    Product product) {
		return service.Saveproduct(product);
	}

	// FETCH ALL PRODUCTS
	@GetMapping("/getAllProduct")
	public ResponseEntity<Object> getAllProducts() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllProducts());
	}

	// FETCH WITH PAGINATION AND SORTING
	@GetMapping("/fetch")
	public ResponseEntity<Object> fetch(@RequestParam("PageNumber") int PageNumber,
			@RequestParam("PageSize") int PageSize) {
		return ResponseEntity.status(HttpStatus.OK).body(service.fetch(PageNumber, PageSize));

	}

	// TO DELETE PRODUCT BY ITS ID
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
	}

	// TO UPDATE PRODUCT
	@PutMapping("/update")
	public List<Product> update(@RequestBody Product product) {
		return service.update(product);
	}

	// TO FETCH NAME
	@GetMapping("/fetch/{name}")
	public List<Product> findByName(@PathVariable String name) {
		return service.findByName(name);
	}

	
	// TO FETCH BY ID ITS PRESENT 
	@GetMapping("/getByid/{id}")
	public ResponseEntity<Product> findById(@PathVariable long id) {
		
		Optional<Product> product = service.findById(id);
		if(product.isPresent()) {
			return new ResponseEntity<>(product.get(), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	

}
