package com.studydevtegani.library_project.spring_boot_library_project.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {
   @Override
   public void run(String... args) throws Exception {

   }
}
