package com.imperialblackapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imperialblackapi.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	public User findByEmail(String username);
}
