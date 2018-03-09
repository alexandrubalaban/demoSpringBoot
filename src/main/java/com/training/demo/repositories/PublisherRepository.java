package com.training.demo.repositories;

import com.training.demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sandu
 * on 09.03.2018
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
