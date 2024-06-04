package com.springwebapp.springwebapp.repositories;

import com.springwebapp.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
