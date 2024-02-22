package com.example.crudapp.controller;

import com.example.crudapp.model.Pelanggan;
import com.example.crudapp.service.PelangganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pelanggan")
public class PelangganController {
    @Autowired
    private PelangganService pelangganService;

    @GetMapping
    public Iterable<Pelanggan> getAllPelanggan() {
        return pelangganService.getAllPelanggan();
    }

    @GetMapping("/{id}")
    public Pelanggan getPelangganById(@PathVariable Long id) {
        return pelangganService.getPelangganById(id);
    }

    @PostMapping
    public Pelanggan simpanPelanggan(@RequestBody Pelanggan pelanggan) {
        return pelangganService.simpanPelangganan(pelanggan);
    }

    @PutMapping("/{id}")
    public Pelanggan updatePelanggan(@PathVariable Long id, @RequestBody Pelanggan pelanggan) {
        pelanggan.setIdPelanggan(id);
        return pelangganService.simpanPelangganan(pelanggan);
    }

    @DeleteMapping("/{id}")
    public void hapusPelanggan(@PathVariable Long id) {
        pelangganService.hapusPelanggan(id);
    }
}
