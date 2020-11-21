/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan59.detectiveconan;

/**
 *
 * @author Rheiza
 *  Nama     : Rheiza Akmal R
 * KELAS    : IF2
 * NIM      : 10119061
 * Deskripsi Program : Program ini dibuat untuk menentukan siapa saja seorang detective dalam anime Detective Conan
 */
public class PBOIF210119061Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Karakter conan = new Karakter("Conan Edogawa (Shinichi Kudo)","Tokyo",true,"Investigasi");
        conan.tampilKarakter();
        
        Karakter ran = new Karakter("Ran Mouri","Osaka",false,"Karate");
        ran.tampilKarakter();
        
        Karakter ai = new Karakter("Ai Haibara (Shiho Miyano / Sherry)","Tokyo",true,"Kimia dan Farmasi");
        ai.tampilKarakter();
    }
    
}
