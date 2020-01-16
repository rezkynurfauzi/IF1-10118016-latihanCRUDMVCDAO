/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rezkynurfauzi.latihanmvcjdbc.main;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import edu.rezkynurfauzi.latihanmvcjdbc.database.kingsbarbershopDatabase;
import edu.rezkynurfauzi.latihanmvcjdbc.entity.pelanggan;
import edu.rezkynurfauzi.latihanmvcjdbc.error.PelangganException;
import edu.rezkynurfauzi.latihanmvcjdbc.service.PelangganDAO;
import edu.rezkynurfauzi.latihanmvcjdbc.view.MainViewPelanggan;

/**
 * NIM   : 10118016
 * Nama  : REZKY NUR FAUZI
 * Kelas : IF-1/S1/III
 *
 * @author Rezky
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
       SwingUtilities.invokeLater(new Runnable() {

           @Override
           public void run() {       
               try{
                   MainViewPelanggan pelanggan = new MainViewPelanggan();
                   pelanggan.loadDatabase();
                   pelanggan.setVisible(true);
               }catch(SQLException e){
               
               
               }
             catch (PelangganException ex) {
                   Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
               }
       }
        
       });    
        
        
       }  
        
        
        
    }
    

