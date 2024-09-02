package com.studydevtegani.library_project.spring_boot_library_project.config;

import com.studydevtegani.library_project.spring_boot_library_project.entities.Author;
import com.studydevtegani.library_project.spring_boot_library_project.entities.Book;
import com.studydevtegani.library_project.spring_boot_library_project.entities.enums.Category;
import com.studydevtegani.library_project.spring_boot_library_project.repositories.AuthorRepository;
import com.studydevtegani.library_project.spring_boot_library_project.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
   @Autowired
   private AuthorRepository authorRepository;

   @Autowired
   private BookRepository bookRepository;
   @Override
   public void run(String... args) throws Exception {
      Author author1 = new Author(null, "Pablo", Instant.now());
      Author author2 = new Author(null, "Gabriel", Instant.now());
      Author author3 = new Author(null, "Isabelle", Instant.now());

      this.authorRepository.saveAll(Arrays.asList(author1, author2, author3));

//      Book book1 = new Book(null, author2, "Fighting", Instant.now(), Category.ACTION);
//      Book book2 = new Book(null, author2, "Washing", Instant.now(), Category.FANTASY);
//      Book book3 = new Book(null, author3, "Reading", Instant.now(), Category.ROMANCE);
//      Book book4 = new Book(null, author1, "Living", Instant.now(), Category.ACTION);
//      Book book5 = new Book(null, author3, "Light", Instant.now(), Category.FANTASY);
//
//      this.bookRepository.saveAll(Arrays.asList(book1, book2, book3, book4, book5));
   }
}
