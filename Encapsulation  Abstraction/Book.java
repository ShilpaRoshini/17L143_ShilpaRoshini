class Book extends Author{
	String name1;
	double price;
	Author author;
	int qtyInStock;
	public Book(String name, String email, String gender, String name1, double price, Author author, int qtyInStock) {
		super(name, email, gender);
		this.name1 = name1;
		this.price = price;
		this.author = author;
		this.qtyInStock = qtyInStock;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	@Override
	public String toString() {
		return "Book [name1=" + name1 + ", price=" + price + ", author=" + author + ", qtyInStock=" + qtyInStock
				+ ", getName1()=" + getName1() + ", getPrice()=" + getPrice() + ", getAuthor()=" + getAuthor()
				+ ", getQtyInStock()=" + getQtyInStock() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getGender()=" + getGender() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}