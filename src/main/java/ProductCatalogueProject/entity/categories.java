package ProductCatalogueProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class categories {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String product_category;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_Category(String product_category) {
		this.product_category = product_category;
	}

	public categories(int id, String product_category) {
		super();
		this.id = id;
		this.product_category = product_category;
	}

	public categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
