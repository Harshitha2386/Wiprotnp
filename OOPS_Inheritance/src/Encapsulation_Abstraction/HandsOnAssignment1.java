package Encapsulation_Abstraction;
class Author {
    private String name;
    private String email;
    private char gender;
    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }
}

public class HandsOnAssignment1 {
	 public static void main(String[] args){
	        Author a = new Author("J.K. Rowling", "jk@gmail.com", 'F');
	        Book b = new Book("Harry Potter", a, 599.99, 20);
	        System.out.println("Book Name : " + b.getName());
	        System.out.println("Price : " + b.getPrice());
	        System.out.println("Quantity : " + b.getQtyInStock());
	        System.out.println("Author Name : " + b.getAuthor().getName());
	        System.out.println("Author Email : " + b.getAuthor().getEmail());
	        System.out.println("Author Gender : " + b.getAuthor().getGender());
	    }
}
