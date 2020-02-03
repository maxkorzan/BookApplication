public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //setters and getters
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isInStock() {
        return isInStock;
    }
    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }


    //default constructor
    public Book(){
    }

    //overloaded constructor



    //print author, title, and description
    public void getDisplayText(){
        System.out.println("Author: " + getAuthor());
        System.out.println("Title: " + getTitle());
        System.out.println("Description: " + getDescription());
    }
}
