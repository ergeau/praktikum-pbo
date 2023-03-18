/**
File : MKubus.java 15/03/2023
Penulis : Raihan Gilang Firdausy
NIM : 24060121130065
Deskripsi : driver class untuk Kubus
**/

package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		
		System.out.println("Panjang sisi Bujur Sangkar : " + bujurSangkar.getPanjangSisi() + "\n");
		System.out.println("Luas Alas Kubus : " + kubus.hitungLuasAlas());
		System.out.println("Volume Kubus : " + kubus.hitungVolume());
	}
}