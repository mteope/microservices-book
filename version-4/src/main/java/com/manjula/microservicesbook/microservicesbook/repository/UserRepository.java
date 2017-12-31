package com.manjula.microservicesbook.microservicesbook.repository;

import com.manjula.microservicesbook.microservicesbook.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * This interface allows us to save and retrieve Users
 */
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByAlias(final String alias);

}
