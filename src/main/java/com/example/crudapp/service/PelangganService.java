package com.example.crudapp.service;

import com.example.crudapp.model.Pelanggan;
import com.example.crudapp.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PelangganService {

    @Autowired
    private PelangganRepository pelangganRepository;

    public Iterable<Pelanggan> getAllPelanggan(){
        return pelangganRepository.findAll();
    }

    public Pelanggan getPelangganById(Long id) {
        return pelangganRepository.findById(id).orElse(null);
    }

    public Pelanggan simpanPelangganan(Pelanggan pelanggan) {
        return pelangganRepository.save(pelanggan);
    }

    public void hapusPelanggan(Long id) {
        pelangganRepository.deleteById(id);
    }
}
