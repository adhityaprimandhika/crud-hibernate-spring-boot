package com.example.crudapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(name = "nama_user")
    private String namaUser;

    @Column(name = "usia")
    private Number usia;

    public User() {
    }

    public User(Long idUser, String namaUser, Number usia) {
        this.idUser = idUser;
        this.namaUser = namaUser;
        this.usia = usia;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public Number getUsia() {
        return usia;
    }

    public void setUsia(Number usia) {
        this.usia = usia;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", namaUser='" + namaUser + '\'' +
                ", usia=" + usia +
                '}';
    }
}
