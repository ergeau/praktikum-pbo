/**
* File: AngkaSial.java 29/03/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
*/
public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/*Penjelasan
1.
Tidak, baris 12 tidak dieksekusi ketika eksepsi terjadi. Ketika angka yang diberikan sama dengan 13, 
eksepsi AngkaSialException akan dilempar dan program akan langsung keluar dari metode cobaAngka(), 
sehingga baris di bawah pernyataan if akan diabaikan dan tidak dieksekusi. 
Selanjutnya, kendali akan diserahkan ke blok catch untuk menangani eksepsi.

2.
Ya, baris 21 akan dieksekusi ketika eksepsi AngkaSialException dilempar. Blok catch akan menangkap eksepsi 
dan mengeksekusi kode di dalamnya. Dalam kasus ini, kode dalam blok catch mencetak pesan kesalahan menggunakan 
metode getMessage() dari AngkaSialException, dan kemudian mencetak pesan tambahan "hati-hati memasukkan angka!!!". 
Setelah kode di dalam blok catch dieksekusi, program akan keluar dari blok try-catch dan melanjutkan 
eksekusi baris berikutnya dari program, yaitu menyelesaikan metode main().
*/