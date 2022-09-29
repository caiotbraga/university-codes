package book;

public class DigitalBook extends Books{

    protected String link;
    
    public DigitalBook(String id, String title, String author, int year, int quantity, String link) {
        super(id, title, author, year, quantity);
        this.link = link;
    }

    @Override
    public String description() {
        
        return  "BOOK ID: "+this.id+
        " | TITLE: "+this.title+
        " | AUTHOR : "+this.author+
        " | YEAR: "+this.year+
        " | QUANTITY: "+this.quantity+
        " | LINK: "+this.link;
    }

    

    
}
