/**
File : Poligon.java 08/03/2023
Penulis : Raihan Gilang Firdausy
NIM : 24060121130065
Deskripsi : representasi dasar dari objek poligon (segi banyak)
**/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	public Poligon(){
		this.jumlahSisi = 0;
	}
	
	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}
	
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
}