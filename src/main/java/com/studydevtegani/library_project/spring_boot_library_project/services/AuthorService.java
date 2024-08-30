package com.studydevtegani.library_project.spring_boot_library_project.services;

import com.studydevtegani.library_project.spring_boot_library_project.entities.Author;
import com.studydevtegani.library_project.spring_boot_library_project.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
   @Autowired
   private AuthorRepository authorRepository;

   public final Author findById(Long id) {
      Optional<Author> author = this.authorRepository.findById(id);
      return author.orElse(null);
   }

   public final List<Author> findAll() {
      return this.authorRepository.findAll();
   }
}
