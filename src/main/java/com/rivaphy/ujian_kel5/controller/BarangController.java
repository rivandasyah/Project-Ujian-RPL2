/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rivaphy.ujian_kel5.controller;

import com.rivaphy.ujian_kel5.model.ModelBarang;
import com.rivaphy.ujian_kel5.service.BarangService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author asus
 */
@Controller
public class BarangController {
    @Autowired
    private BarangService service;
    
    public String addBarang(@RequestBody ModelBarang barang) {
        service.addBrng(barang);
        return "Barang added successfully";
    }
    
    public ModelBarang getBarang(@PathVariable int id) {
        return service.getBrng(id);
    }
    
    public String updateBarang(@RequestBody ModelBarang barang) {
        service.updateBrng(barang);
        return "Barang updated successfully";
    }
    
    public String deleteBarang(@PathVariable int id) {
        service.deleteBrng(id);
        return "Barang deleted successfully";
    }
    
    public List<ModelBarang> getAllBarang() {
        return service.getAllBrng();
    }
    
    public List<ModelBarang> getByKategori(@RequestParam String kategoriBarang) {
        return service.getByKtgr(kategoriBarang);
    }
}
