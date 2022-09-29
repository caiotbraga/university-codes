package book;

public class AudioBook extends DigitalBook{

    private double time;

    public AudioBook(String id, String title, String author, int year, String link, double time) {
        super(id, title, author, year, link);
        this.time = time;
    }

   

    
    
}
