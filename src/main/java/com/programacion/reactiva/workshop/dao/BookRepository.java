package com.programacion.reactiva.workshop.dao;

import com.programacion.reactiva.workshop.model.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BookRepository extends ReactiveCrudRepository<Book,Long> {
}
