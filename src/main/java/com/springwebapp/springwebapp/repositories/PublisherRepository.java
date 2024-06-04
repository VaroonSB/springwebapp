package com.springwebapp.springwebapp.repositories;

import com.springwebapp.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
