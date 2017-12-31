package com.manjula.microservicesbook.microservicesbook.repository;

import com.manjula.microservicesbook.microservicesbook.domain.Multiplication;
import org.springframework.data.repository.CrudRepository;

/**
 * This interface allows us to save and retrieve Multiplications
 */
public interface MultiplicationRepository extends CrudRepository<Multiplication, Long> {
}
