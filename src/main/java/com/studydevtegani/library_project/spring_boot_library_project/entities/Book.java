package com.studydevtegani.library_project.spring_boot_library_project.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.studydevtegani.library_project.spring_boot_library_project.entities.enums.Category;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_book")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Book implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @EqualsAndHashCode.Include
   private Long id;
   @OneToOne
   @EqualsAndHashCode.Include
   private Author author;
   @EqualsAndHashCode.Include
   private String name;
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
   private Instant publishedDate;
   @EqualsAndHashCode.Include
   private Category category;

   public Book() {
   }

   public Book(Long id, Author author, String name, Instant publishedDate, Category category) {
      this.id = id;
      this.author = author;
      this.name = name;
      this.publishedDate = publishedDate;
      this.category = category;
   }
}
