package com.studydevtegani.library_project.spring_boot_library_project.services;

import com.studydevtegani.library_project.spring_boot_library_project.entities.Book;
import com.studydevtegani.library_project.spring_boot_library_project.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
   @Autowired
   private BookRepository bookRepository;

   public final Book findById(Long id) {
      Optional<Book> book = this.bookRepository.findById(id);
      return book.orElse(null);
   }

   public final List<Book> findAll() {
      return this.bookRepository.findAll();
   }
}
