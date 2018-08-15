package com.ndumiso.persistence;

import java.util.List;
import java.util.Optional;

/**
 * Provides a persistence API for business domain object T
 *
 * @param <T>
 */
public interface DomainObjectDao<T> {

    /**
     * Saves to the database the business domain entity T
     *
     * @return T The saved entity
     */
    T save(T entity);


    /**
     * Retrieves the business domain entity T from the database filtered by given id.
     * If the entity is not found returns an empty Optional.
     *
     * @param id
     * @return
     */
    Optional<T> getById(String id);


    List<T> getAll();
}
