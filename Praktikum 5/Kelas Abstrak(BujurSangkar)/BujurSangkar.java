/**
* File: BujurSangkar.java 25/03/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : kelas yang membuat implementasi metode abstrak pada bangun datar
*
*/

public class BujurSangkar extends BangunDatar{
	public double hitungLuas(double sisi){
		luas = sisi*sisi;
		return luas;
	}
}

/*Jika kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar, 
maka kelas BujurSangkar harus diubah menjadi kelas abstrak juga. Hal ini dikarenakan jika sebuah kelas 
memiliki metode abstrak, maka kelas tersebut harus dijadikan abstrak juga. Oleh karena itu, 
jika kelas BujurSangkar tidak mengimplementasikan metode abstrak hitungLuas() yang ada pada kelas BangunDatar, 
maka kelas BujurSangkar harus diubah menjadi kelas abstrak.

Namun, jika kelas BujurSangkar tetap dipaksa untuk diinstansiasi meskipun tidak mengimplementasikan metode abstrak hitungLuas() 
yang ada pada kelas BangunDatar, maka akan terjadi error pada saat kompilasi program karena kelas BujurSangkar tidak menyediakan 
implementasi lengkap dari kelas BangunDatar yang merupakan superclass-nya. Pesan error yang akan muncul biasanya akan mengatakan 
bahwa kelas BujurSangkar harus dijadikan abstrak atau harus mengimplementasikan metode abstrak yang ada pada kelas BangunDatar.
*/
