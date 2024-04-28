package ProductCatalogueProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;

	@Column
	private String userId;

	@Column(length = 10)
	private float rating;

	@Column(length = 200)
	private String comment;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
	
	public Rating(long id, String userId, float rating, String comment) {
		super();
		this.id = id;
		this.userId = userId;
		this.rating = rating;
		this.comment = comment;
	}

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

}
