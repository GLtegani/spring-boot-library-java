package com.studydevtegani.library_project.spring_boot_library_project.resources;

import com.studydevtegani.library_project.spring_boot_library_project.entities.Library;
import com.studydevtegani.library_project.spring_boot_library_project.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/library")
public class LibraryResource {
   @Autowired
   private LibraryService libraryService;

   @GetMapping(value = "/{id}")
   public ResponseEntity<Library> findById(@PathVariable Long id) {
      Library library = this.libraryService.findById(id);
      return ResponseEntity.ok(library);
   }

   @GetMapping
   public ResponseEntity<List<Library>> findAll() {
      List<Library> library = this.libraryService.findAll();
      return ResponseEntity.ok(library);
   }
}
