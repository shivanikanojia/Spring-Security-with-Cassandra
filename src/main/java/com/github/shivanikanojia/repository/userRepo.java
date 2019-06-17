package com.github.shivanikanojia.repository;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.github.shivanikanojia.model.Users;

@Repository
public interface userRepo extends CassandraRepository<Users, Long> {

	@AllowFiltering
	Users findByUsername(String username);
}
