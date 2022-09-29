package book;

import java.util.ArrayList;
import java.util.List;

import Exceptions.DontExistBookException;
import Exceptions.ExistBookException;

public class BookManagement {

    private List<Books> bookList;

    public BookManagement(){
        bookList = new ArrayList();
    }
    
    public void add(Books book) throws ExistBookException{
        if(existBook(book.getBookId()) == true){
            ExistBookException msg = new ExistBookException();
            throw msg;
        }
        else{
            bookList.add(book);
        }
    }

    public boolean existBook(String id){
        for (Books product : bookList) {
            if(product.getBookId().compareTo(id) == 0)
                return true;
        }
        return false;
    }

    public void remove(Books book) throws DontExistBookException{
        if(existBook(book.getBookId()) == false){
            DontExistBookException msg = new DontExistBookException();
            throw msg;
        }
        else{
            bookList.remove(book);
        }
    }

    public List<Books> getBookList() {
        return bookList;
    }

}
