package com.studydevtegani.library_project.spring_boot_library_project.services;

import com.studydevtegani.library_project.spring_boot_library_project.entities.Library;
import com.studydevtegani.library_project.spring_boot_library_project.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
   @Autowired
   private LibraryRepository libraryRepository;

   public final Library findById(Long id) {
      Optional<Library> library = this.libraryRepository.findById(id);
      return library.orElse(null);
   }

   public final List<Library> findAll() {
      return this.libraryRepository.findAll();
   }
}
