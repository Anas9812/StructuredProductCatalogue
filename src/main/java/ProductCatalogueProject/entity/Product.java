package ProductCatalogueProject.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;

	@Column
	private String name;

	@Column(length = 1000)
	private String description;

	@Column
	private double price;
	
	@Column
	@OneToMany(cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
	private List<categories> category;
	
	@Column
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Attributes> attribute;
	
	
	@OneToMany( cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Rating> ratings;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public List<categories> getCategory() {
		return category;
	}

	public void setCategory(List<categories> category) {
		this.category = category;
	}

	public List<Attributes> getAttribute() {
		return attribute;
	}

	public void setAttribute(List<Attributes> attribute) {
		this.attribute = attribute;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}



	public Product(long id, String name, String description, double price, List<categories> category,
			List<Attributes> attribute, List<Rating> ratings) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
		this.attribute = attribute;
		this.ratings = ratings;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	
	
	
	
	


	
	