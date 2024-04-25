package com.bookStore.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.repository.BookRepository;

@Service
public class BookService {
  
   @Autowired
   private BookRepository bReop;
	
   public  void save(Book b) {
	   bReop.save(b);
   }
   public List<Book> getAllBook(){
	   return bReop.findAll();
   }
   public Book getBookById(int id) {
	   return bReop.findById(id).get();
   }
   public void deleteById(int id) {
	   bReop.deleteById(id);
   }
}
