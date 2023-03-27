/**
* File: BangunDatar.java 25/03/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : kelas abstrak, berisi abstraksi bangun datar
*
*/

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);

	public void setLuas(double l) {
		luas = 1;
	}
	
	public double getLuas() {
		return luas;
	}
}