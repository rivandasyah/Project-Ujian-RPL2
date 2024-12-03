/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rivaphy.ujian_kel5.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author asus
 */
public class ModelTabelBarang extends AbstractTableModel {

    private List<ModelBarang> barangList;
    private String[] columnNames = {"ID", "Kode Barang", "Nama Barang", "Kategori Barang", "Harga Barang", "Jumlah", "Tanggal Exp"};

    public ModelTabelBarang(List<ModelBarang> barangList) {
        this.barangList = barangList;
    }

    @Override
    public int getRowCount() {
        return barangList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelBarang barang = barangList.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                barang.getId();
            case 1 ->
                barang.getKodeBarang();
            case 2 ->
                barang.getNamaBarang();
            case 3 ->
                barang.getKategoriBarang();
            case 4 ->
                barang.getHargaBarang();
            case 5 ->
                barang.getJumlah();
            case 6 ->
                barang.getTanggalExp();
            default ->
                null;
        };
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public void setKategoriList(List<ModelBarang> barangList) {
        this.barangList = barangList;
        fireTableDataChanged();
    }

}
