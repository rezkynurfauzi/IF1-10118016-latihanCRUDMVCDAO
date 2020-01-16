/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rezkynurfauzi.latihanmvcjdbc.error;

/**
 * NIM   : 10118016
 * Nama  : REZKY NUR FAUZI
 * Kelas : IF-1/S1/III
 *
 * @author Rezky
 */
public class PelangganException extends Exception {

    /**
     * Creates a new instance of <code>PelangganException</code> without detail
     * message.
     */
    public PelangganException() {
    }

    /**
     * Constructs an instance of <code>PelangganException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganException(String msg) {
        super(msg);
    }
}
