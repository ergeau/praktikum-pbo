/**
*File : LambdaHashmap.java 05/06/2023
*Nama : Raihan Gilang Firdausy / 24060121130065
*Deskripsi: Implementasi lambda pada hashmap untuk menampilkan data mahasiswa
*/

import java.util.*;

public class LambdaHashmap{
    public static void main(String[] args){
        //Membuat Hashmap mahasiswa
        Map<String, String> mahasiswa = new HashMap<>();
		
        //Mengisi data mahasiswa
        mahasiswa.put("24060121130065", "Raihan Gilang Firdausy");
		
		//Mencetak isi
        mahasiswa.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}