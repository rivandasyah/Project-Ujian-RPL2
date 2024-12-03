/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rivaphy.ujian_kel5.service;

import com.rivaphy.ujian_kel5.model.ModelBarang;
import com.rivaphy.ujian_kel5.repository.BarangRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asus
 */
@Service
public class BarangService {
    @Autowired
    private BarangRepository repository;
    
    public void addBrng(ModelBarang brng) {
        repository.save(brng);
    }
    
    public ModelBarang getBrng(int id) {
        return repository.findById(id).orElse(null);
    }
    
    public void updateBrng(ModelBarang brng) {
        repository.save(brng);
    }
    
    public void deleteBrng(int id) {
        repository.deleteById(id);
    }
    
    public List<ModelBarang> getAllBrng() {
        return repository.findAll();
    }
    
    public List<ModelBarang> getByKtgr(String kategoriBarang) {
        return repository.findByKategoriBarang(kategoriBarang);
    }
}
