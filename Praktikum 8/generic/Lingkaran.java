/**
* File: Lingkaran.java 17/05/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : implementasi Lingkaran sebagai BangunDatar
*/

public class Lingkaran extends BangunDatar{
	public double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}
