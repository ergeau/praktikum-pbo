/**
* File: Vehicle.java 03/05/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : Program Super class Vehicle pada polimorfisme inclusion 1
*/

public class Vehicle {
	void calRent(int distance, float price) {
		float fare=distance* price;
		System.out.println("vehicle price = "+fare) ;
	}
}

