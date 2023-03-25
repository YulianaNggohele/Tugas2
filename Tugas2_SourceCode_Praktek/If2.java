// NIM : 13020210175
// NAMA : YULIANA NGGOHELE
// HARI/TANGGAL/WAKTU : JUMAT, 17 MARET 2023, 18:24

import java.util.Scanner;

/* Contoh pemakaian IF dua kasus komplementer */
/* Membaca sebuah nilai */
/* Menuliskan 'Nilai a positif , nilai a', jika a >= 0 */
/* 'Nilai a negatif , nilai a', jika a<0 */

public class If2 {

/**
* @param args
*/
public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
	int a;
	Scanner masukan=new Scanner(System.in);
	/* Program */

	System.out.print ("Contoh IF dua kasus \n");
	System.out.print ("Ketikkan suatu nilai integer :");
	a=masukan.nextInt();
	if (a >=0) {
		System.out.println ("Nilai a positf "+ a);
	}else
	{
		System.out.println ("Nilai a negatif "+ a);
	}
}
}