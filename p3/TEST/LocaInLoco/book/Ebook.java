package book;

public class Ebook extends DigitalBook{

    private int numberOfPages;

    public Ebook(String id, String title, String author, int year, int quantity, String link, int nPages) {
        super(id, title, author, year, quantity, link);
        this.numberOfPages = nPages;
    }

    @Override
    public String description() {
        return "BOOK ID: "+this.id+
        " | TITLE: "+this.title+
        " | AUTHOR : "+this.author+
        " | YEAR: "+this.year+
        " | QUANTITY: "+this.quantity+
        " | LINK: "+this.link+
        " | NUMBER OF PAGES : "+this.numberOfPages;
    }

   
    
}
