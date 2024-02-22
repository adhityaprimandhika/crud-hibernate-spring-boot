package com.example.crudapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pelanggan")
public class Pelanggan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPelanggan;

    @Column(name = "nama_pelanggan")
    private String namaPelanggan;

    @Column(name = "alamat")
    private String alamat;

    public Pelanggan() {
    }

    public Pelanggan(Long idPelanggan, String namaPelanggan, String alamat) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
    }

    public Long getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(Long idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Pelanggan{" +
                "idPelanggan=" + idPelanggan +
                ", namaPelanggan='" + namaPelanggan + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}
