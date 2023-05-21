/**
* File: BangunDatarGeneric.java 17/05/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : kelas konstruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{ // T telah diganti dengan T1
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

/* Jika mengganti 'T' dengan karakter lain seperti T1, T2, 
atau T1234 di dalam kelas BangunDatarGeneric, maka kode 
tersebut akan tetap berjalan tanpa masalah. 
Karakter - karakter yang digunakan hanya merupakan nama variabel 
generik yang dapat diganti dengan karakter atau kata lain yang valid.
 */