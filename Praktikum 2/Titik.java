/**
Titik.java 201/03/2023
Penulis : Raihan Gilang Firdausy
NIM : 24060121130065
Deskripsi : Program Kelas titik
**/

class Titik{
	
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}
	
	public void setAbsis(double a){
		absis=a;
	}
	
	public void setOrdinat(double b){
		ordinat=b;
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
		
	}
	
	public int getCounterTitik(){
		return counterTitik;
	}
}