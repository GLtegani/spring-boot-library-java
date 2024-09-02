package com.studydevtegani.library_project.spring_boot_library_project.resources;

import com.studydevtegani.library_project.spring_boot_library_project.entities.Book;
import com.studydevtegani.library_project.spring_boot_library_project.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookResource {
   @Autowired
   private BookService bookService;

   @GetMapping(value = "/{id}")
   public final ResponseEntity<Book> findById(@PathVariable Long id) {
      Book book = this.bookService.findById(id);
      return ResponseEntity.ok().body(book);
   }

   @GetMapping
   public final ResponseEntity<List<Book>> findAll() {
      List<Book> books = this.bookService.findAll();
      return ResponseEntity.ok().body(books);
   }
}
