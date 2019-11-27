package com.rafal.AJiOconverter.repository;

import com.rafal.AJiOconverter.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
