package com.springframework.spring_6_webapp.repository;

import com.springframework.spring_6_webapp.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public class AuthorRepository extends JpaRepository<Author, Long> {
}
