package nl.inholland.controller;

import nl.inholland.model.Book;
import nl.inholland.service.BookShopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.awt.*;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookShopService service;

    public BookController(BookShopService service) {
        this.service = service;
    }

    @RequestMapping(value="", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks(){
        return service.getBooks();
    }

    @RequestMapping(value = "id", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookById(@RequestParam(value="id") String id){
        return service.getBook(id);
    }

    @RequestMapping(value="", method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }


   @RequestMapping(value="title", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   public Book getBookByTitle(@RequestParam(value="title") String title){
   return service.getBookByTitle(title);
   }

}
