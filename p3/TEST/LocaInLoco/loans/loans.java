package loans;

import person.User;
import book.*;

public class Loans {
    
    private String loanId;
    private User user;
    private Books book; 
    private int quantity;

    public Loans(String loanId, User user, Books book){
        this.loanId = loanId;
        this.user = user;
        this.book = book;
        this.quantity = this.book.getQuantity();
    }

    public String getLoanId(){
        return loanId;
    }
    public User getUser() {
        return user;
    }

    public Books getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

}
