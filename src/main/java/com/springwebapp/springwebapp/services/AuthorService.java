package com.springwebapp.springwebapp.services;

import com.springwebapp.springwebapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
