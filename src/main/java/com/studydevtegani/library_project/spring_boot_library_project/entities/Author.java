package com.studydevtegani.library_project.spring_boot_library_project.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_author")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Author implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @EqualsAndHashCode.Include
   private Long id;
   private String name;
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
   private Instant birthDate;

   public Author() {
   }

   public Author(Long id, String name, Instant birthDate) {
      this.id = id;
      this.name = name;
      this.birthDate = birthDate;
   }
}
