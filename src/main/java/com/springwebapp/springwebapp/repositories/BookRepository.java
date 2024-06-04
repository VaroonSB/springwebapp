package com.springwebapp.springwebapp.repositories;

import com.springwebapp.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
