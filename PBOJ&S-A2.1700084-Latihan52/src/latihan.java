/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 * Nama     : Opan Dilaga
 * NIM      : A2.1700084
 * Kelas    : TI IV E J&S
 */
public class latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("rizki adam kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10110269");
        mahasiswa.setNama("nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO2");
        mahasiswa.kelasApa();
    }
    
}
