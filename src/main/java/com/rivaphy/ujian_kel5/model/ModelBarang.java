/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rivaphy.ujian_kel5.model;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "barang")
public class ModelBarang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "kode_barang", nullable = false, length = 10)
    private String kodeBarang;
    
    @Column(name = "nama_barang", nullable = false, length = 50)
    private String namaBarang;
    
    @Column(name = "kategori_barang", nullable = false, length = 50)
    private String kategoriBarang;
    
    @Column(name = "harga_barang", nullable = false)
    private String hargaBarang;
    
    @Column(name = "jumlah", nullable = false)
    private String jumlah;
    
    @Column(name = "tanggal_exp")
    private LocalDate tanggalExp;
    
    public ModelBarang() {
        
    }

    public ModelBarang(int id, String kodeBarang, String namaBarang, String kategoriBarang, String hargaBarang, String jumlah, LocalDate tanggalExp) {
        this.id = id;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kategoriBarang = kategoriBarang;
        this.hargaBarang = hargaBarang;
        this.jumlah = jumlah;
        this.tanggalExp = tanggalExp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(String kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }

    public String getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public LocalDate getTanggalExp() {
        return tanggalExp;
    }

    public void setTanggalExp(LocalDate tanggalExp) {
        this.tanggalExp = tanggalExp;
    }
}
