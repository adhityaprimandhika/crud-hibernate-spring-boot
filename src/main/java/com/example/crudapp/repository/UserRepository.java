package com.example.crudapp.repository;

import com.example.crudapp.model.Pelanggan;
import com.example.crudapp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
