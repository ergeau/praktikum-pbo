/**
* File: Manajer.java 03/05/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : Program Subclass Manajer pada polimorfisme inclusion 2
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}