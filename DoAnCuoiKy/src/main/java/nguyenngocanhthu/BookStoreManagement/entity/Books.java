package nguyenngocanhthu.BookStoreManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "author_id", referencedColumnName = "id")
	private Author author;
	
	@Column(name = "price")
	private double price;

	public Books(int id, String title, Category category, Author author, double price) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.author = author;
		this.price = price;
	}
	
	public Books() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
