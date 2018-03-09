package com.training.demo.repositories;

import com.training.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sandu
 * on 09.03.2018
 */
public interface AuthorReository extends CrudRepository<Author,Long> {
}
