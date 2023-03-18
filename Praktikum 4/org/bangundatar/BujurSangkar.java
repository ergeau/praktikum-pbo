/**
File : BujurSangkar.java 15/03/2023
Penulis : Raihan Gilang Firdausy
NIM : 24060121130065
Deskripsi : representasi dasar dari objek bujur sangkar, turunan kelas poligon
**/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas(){
		return this.panjangSisi * this.panjangSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}