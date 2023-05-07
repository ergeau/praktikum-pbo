/**
* File: Pegawai.java 03/05/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : Program Super class Pegawai pada polimorfisme inclusion 2
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
