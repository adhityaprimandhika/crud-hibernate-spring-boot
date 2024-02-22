package com.example.crudapp.repository;

import com.example.crudapp.model.Pelanggan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PelangganRepository extends CrudRepository<Pelanggan, Long> {
}
