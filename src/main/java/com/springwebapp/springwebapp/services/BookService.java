package com.springwebapp.springwebapp.services;

import com.springwebapp.springwebapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
