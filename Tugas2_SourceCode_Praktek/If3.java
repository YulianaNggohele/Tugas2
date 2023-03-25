// NIM : 13020210175
// NAMA : YULIANA NGGOHELE
// HARI/TANGGAL/WAKTU : JUMAT, 17 MARET 2023, 20:45

import java.util.Scanner;

/* Contoh pemakaian IF tiga kasus */
/* Membaca sebuah nilai */
/* 'Nilai Nol, nilai a', jika a = 0 */
/* 'Nilai a negatif , nilai a', jika a <0 */

public class If3 {

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		/* Kamus */
		int a;
		Scanner masukan=new Scanner (System.in);
		/* Program */
		System.out.print ("Contoh IF tiga kasus \n");
		System.out.print ("Ketikkan suatu nilai integer :");
		a=masukan.nextInt();
		if (a> 0){
			System.out.println ("Nilai a positis "+ a);
		}else if (a == 0){
			System.out.println ("Nilai Nol "+ a);
		}else {
			System.out.println ("Nilai a negatif "+ a);
		}
	}
}
