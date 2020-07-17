package com.restapi.demo;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.restapi.demo.Books;  
import  com.restapi.demo.BooksService;  




@RestController  
public class BooksController   
{  
 
@Autowired  
BooksService booksService;  


//get method   
@GetMapping("/books")  
private List<Books> getAllBooks()   
{  
return booksService.getAllBooks();  
}  



//get method for only one entity
@GetMapping("/book/{bookid}")  
private Books getBooks(@PathVariable("bookid") int bookid)   
{  
return booksService.getBooksById(bookid);  
}  




//Delete method
@DeleteMapping("/book/{bookid}")  
private void deleteBook(@PathVariable("bookid") int bookid)   
{  
booksService.delete(bookid);  
}  




//post method 
@PostMapping("/books")  
private int saveBook(@RequestBody Books books)   
{  
booksService.saveOrUpdate(books);  
return books.getBookid();  
}  



//Update method   
@PutMapping("/books")  
private Books update(@RequestBody Books books)   
{  
booksService.saveOrUpdate(books);  
return books;  
}  
}  
