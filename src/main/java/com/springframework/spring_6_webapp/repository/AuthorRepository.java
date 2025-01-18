package com.springframework.spring_6_webapp.repository;

import com.springframework.spring_6_webapp.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
