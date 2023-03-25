// NIM : 13020210175
// NAMA : YULIANA NGGOHELE
// HARI/TANGGAL/WAKTU : SABTU, 18 MARET 2023, 18:20

import java.util.Scanner;

/* Membaca jari-jari, menghitung luas lingkaran */
/* Latihan pemakaian konstanta */
public class Konstant {

/**
* @param args
*/
public static void main (String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
	final float PHI = 3.1415f;
	float r;
	Scanner masukan=new Scanner(System.in);
	/*Program */
	/* baca data */
	System.out.print ("Jari-jari lingkaran =");
	r = masukan.nextFloat();
	/* Hitung dan tulis hasil */
	System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n ");
	System.out.print ("Akhir program \n");
}

}
