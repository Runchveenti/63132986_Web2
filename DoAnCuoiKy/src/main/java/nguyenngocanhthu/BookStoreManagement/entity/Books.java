package nguyenngocanhthu.BookStoreManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Books {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="category_id")
	private int category_id;
	@Column(name="author_id")
	private int author_id;
	@Column(name="price")
	private double price;
	public Books(int id, String title, int category_id, int author_id, double price) {
		super();
		this.id = id;
		this.title = title;
		this.category_id = category_id;
		this.author_id = author_id;
		this.price = price;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return title;
	}
	public void setName(String title) {
		this.title = title;
	}
	public int getCategory() {
		return category_id;
	}
	public void setCategory(int category_id) {
		this.category_id = category_id;
	}
	public int getAuthor() {
		return author_id;
	}
	public void setAuthor(int author_id) {
		this.author_id = author_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
