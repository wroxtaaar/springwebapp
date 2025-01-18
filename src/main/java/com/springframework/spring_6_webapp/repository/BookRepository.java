package com.springframework.spring_6_webapp.repository;

import com.springframework.spring_6_webapp.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public class BookRepository extends JpaRepository<Book, Long> {
}
