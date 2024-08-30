package com.studydevtegani.library_project.spring_boot_library_project.repositories;

import com.studydevtegani.library_project.spring_boot_library_project.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
