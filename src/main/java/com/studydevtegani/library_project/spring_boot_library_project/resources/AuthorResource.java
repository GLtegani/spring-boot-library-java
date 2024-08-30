package com.studydevtegani.library_project.spring_boot_library_project.resources;

import com.studydevtegani.library_project.spring_boot_library_project.entities.Author;
import com.studydevtegani.library_project.spring_boot_library_project.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/authors")
public class AuthorResource {
   @Autowired
   private AuthorService authorService;

   @GetMapping(value = "/{id}")
   public final ResponseEntity<Author> findById(@PathVariable Long id) {
      Author author = this.authorService.findById(id);
      return ResponseEntity.ok().body(author);
   }

   @GetMapping
   public final ResponseEntity<List<Author>> findAll() {
      List<Author> authors = this.authorService.findAll();
      return ResponseEntity.ok().body(authors);
   }
}
