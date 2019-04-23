package nl.inholland.service;
import org.springframework.stereotype.Service;
import nl.inholland.model.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookShopService {
    List<Book> books = new ArrayList<>(
            Arrays.asList(
                    new Book("1", "Dragons", "John Snow", "fiction", "2019"),
                    new Book("2", "ASL Theory", "Remko van der Pols", "schoolbook", "2012"),
                    new Book("3", "Steve Jobs", "Walter Isaacson", "non-fiction", "2011")
            )
    );

    public List<Book> getBooks(){
        return books;
    }

    public Book getBook(String id){
        for(Book book : books){
            if (book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book){
        books.add(book);
    }



}
