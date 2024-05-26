package nguyenngocanhthu.BookStoreManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Books {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(name = "price")
    private double price;
    
    @Column(name = "author")
    private String authorName;

    @Column(name = "category")
    private String categoryName;
    
    public Books() {
        super();
    }

	public Books(int id, String title, Category category, Author author, double price, String authorName,
			String categoryName) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.author = author;
		this.price = price;
		this.authorName = authorName;
		this.categoryName = categoryName;
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

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

    

    
}
