/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rivaphy.ujian_kel5.repository;

import com.rivaphy.ujian_kel5.model.ModelBarang;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asus
 */
@Repository
public interface BarangRepository extends JpaRepository<ModelBarang, Integer>{
    List<ModelBarang> findByKategoriBarang(String kategoriBarang);
}
