/**
* File: Car.java 03/05/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : Program subclass Car pada polimorfisme inclusion 1
*/

public class Car extends Vehicle{
	void calRent(int jarak, float harga){
		float fare=jarak*harga;
		fare=fare-100.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}

