package com.studydevtegani.library_project.spring_boot_library_project.entities.enums;

import lombok.Getter;

@Getter
public enum Category {
   FANTASY(1),
   ACTION(2),
   ROMANCE(3);

   private final int code;

   private Category(int code) {
      this.code = code;
   }

   public static Category valueOf(int code) {
      for(Category category : Category.values()) {
         if(category.getCode() == code) {
            return category;
         }
      }
      throw new IllegalArgumentException("Invalid Category code");
   }
}
