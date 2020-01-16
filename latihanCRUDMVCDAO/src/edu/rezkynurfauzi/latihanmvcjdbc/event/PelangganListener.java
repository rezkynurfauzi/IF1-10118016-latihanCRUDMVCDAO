/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rezkynurfauzi.latihanmvcjdbc.event;

import edu.rezkynurfauzi.latihanmvcjdbc.entity.pelanggan;
import edu.rezkynurfauzi.latihanmvcjdbc.model.PelangganModel;

/**
 * NIM   : 10118016
 * Nama  : REZKY NUR FAUZI
 * Kelas : IF-1/S1/III
 *
 * @author Rezky
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(pelanggan pelanggan);

    
    
}
