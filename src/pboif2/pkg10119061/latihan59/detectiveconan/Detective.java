/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan59.detectiveconan;

/**
 *
 * @author Rheiza
 */
public class Detective {
    protected String nama, asal;
    protected boolean detective;
    
    public Detective(String nama, String asal, boolean detective) {
        this.nama = nama;
        this.asal = asal;
        this.detective = detective;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public boolean isDetective() {
        return detective;
    }
}
