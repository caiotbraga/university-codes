package book;

import java.util.ArrayList;
import java.util.List;

import Exceptions.ExistProcuctException;

public class BookList {

    private List<Books> bookList;

    public BookList(){
        bookList = new ArrayList();
    }
    
    public void add(Books book){
        if(existBook(book.getBookId()) == true){
            
        }
        bookList.add(book);
    }

    public boolean existBook(String id){
        for (Books product : bookList) {
            if(product.getBookId().compareTo(id) == 0)
                return true;
        }
        return false;
    }

    public List<Books> getBookList() {
        return bookList;
    }

}
