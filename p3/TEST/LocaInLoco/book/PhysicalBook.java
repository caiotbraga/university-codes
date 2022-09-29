package book;

public class PhysicalBook extends Books{

    private String isbn;
    private String edition;

    public PhysicalBook(String id, String title, String author, int year, int quantity, String isbn, String edition) {
        super(id, title, author, year, quantity);
        this.isbn = isbn;
        this.edition = edition;
    }

    @Override
    public String description() {
        
        return "BOOK ID: "+this.id+
        " | TITLE: "+this.title+
        " | AUTHOR : "+this.author+
        " | YEAR: "+this.year+
        " | QUANTITY: "+this.quantity+
        " | ISBN: "+this.isbn+
        " | EDITION : "+this.edition;
    }
    
}
