package book;

abstract public class Books implements Ibook{

    protected String id;
    protected String title;
    protected String author;
    protected int year;
    protected int quantity;

    public Books(String id, String title, String author, int year, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.quantity = quantity;
    }

    public String getBookId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
    
    public int getQuantity(){
        return quantity;
    }
   
    
    
}
