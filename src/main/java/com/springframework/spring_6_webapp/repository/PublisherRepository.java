package com.springframework.spring_6_webapp.repository;

import com.springframework.spring_6_webapp.domain.Book;
import com.springframework.spring_6_webapp.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
