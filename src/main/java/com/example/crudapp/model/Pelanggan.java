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

    @Column(name = "no_telp")
    private String noTelp;

    public Pelanggan() {
    }

    public Pelanggan(Long idPelanggan, String namaPelanggan, String alamat, String noTelp) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
        this.noTelp = noTelp;
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

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return "Pelanggan{" +
                "idPelanggan=" + idPelanggan +
                ", namaPelanggan='" + namaPelanggan + '\'' +
                ", alamat='" + alamat + '\'' +
                ", noTelp='" + noTelp + '\'' +
                '}';
    }
}
