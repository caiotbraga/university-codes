package book;

public class Ebook extends DigitalBook{

    private int numberOfPages;

    public Ebook(String id, String title, String author, int year, String link, int nPages) {
        super(id, title, author, year, link);
        this.numberOfPages = nPages;
    }

    

   
    
}
