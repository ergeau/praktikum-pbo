/**
Titik.java 22/02/2023
Penulis : Raihan Gilang Firdausy
NIM : 24060121130065
Deskripsi : Program Kelas titik
**/

class Titik{
	
	double absis;
	double ordinat;
	static int counterTitik;
	
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
	
	void setAbsis(double a){
		absis=a;
	}
	
	void setOrdinat(double b){
		ordinat=b;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
		
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}