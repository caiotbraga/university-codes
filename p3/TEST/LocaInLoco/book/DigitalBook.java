package book;

public class DigitalBook extends Books{

    protected String link;
    
    public DigitalBook(String id, String title, String author, int year, String link) {
        super(id, title, author, year);
        this.link = link;
    }

    

    
}
