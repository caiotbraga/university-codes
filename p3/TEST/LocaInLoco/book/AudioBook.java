package book;

public class AudioBook extends DigitalBook{

    private double time;

    public AudioBook(String id, String title, String author, int year, int quantity, String link, double time) {
        super(id, title, author, year, quantity, link);
        this.time = time;
    }

    @Override
    public String description() {
        return "BOOK ID : "+this.id+
        " | TITLE : "+this.title+
        " | AUTHOR : "+this.author+
        " | YEAR : "+this.year+
        " | QUANTITY : "+this.quantity+
        " | LINK : "+this.link+
        " | TIME: "+this.time;
    }

   

    
    
}
