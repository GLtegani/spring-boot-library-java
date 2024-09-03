package com.studydevtegani.library_project.spring_boot_library_project.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_library")
public class Library implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @EqualsAndHashCode.Include
   private Long id;
   private String name;
   @OneToMany(mappedBy = "library")
   @Setter(AccessLevel.NONE)
   private Set<Book> books = new HashSet<>();

   public Library() {
   }

   public Library(Long id, String name) {
      this.id = id;
      this.name = name;
   }

   public final void addBook(Book book) {
      this.books.add(book);
   }
}
