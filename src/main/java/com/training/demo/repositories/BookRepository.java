package com.training.demo.repositories;

import com.training.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sandu
 * on 09.03.2018
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
