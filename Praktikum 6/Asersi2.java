/**
* File: Asersi2.java 29/03/2023
* Penulis: Raihan Gilang Firdausy
* Deskripsi : Program untuk demo asersi, yang akan menolak input
				jari - jari lingkaran yang bernilai nol
*
*/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}
//class Asersi 2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

/*Penjelasan
Secara konsep, program Asersi2 ada yang kurang tepat, pada parameter assert yaitu "jariJari>0".
Keluaran apabila jari jari kurang dari 0 adalah "jari jari tidak boleh nol!!!". Ketika bilangan kurang dari nol
yaitu negatif dimasukkan maka keluarannya juga sama. Maka dari itu "jariJari>0" seharusnya diubah menjadi"jariJari != 0" 
agar lebih tepatdengan pesan keluarannya yaitu "jari jari tidak boleh nol!!!"
*/
