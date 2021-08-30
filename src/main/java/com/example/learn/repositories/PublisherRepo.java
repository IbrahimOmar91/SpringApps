package com.example.learn.repositories;

import com.example.learn.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepo extends CrudRepository<Publisher, Long> {
}
