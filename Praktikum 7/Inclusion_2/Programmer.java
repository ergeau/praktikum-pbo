/**
* File: Programmer.java 03/05/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : Program Subclass Programmer pada Polimorfisme Inclusion 2
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}