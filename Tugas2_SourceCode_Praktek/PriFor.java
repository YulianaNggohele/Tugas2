// NIM : 13020210175
// NAMA : YULIANA NGGOHELE
// HARI/TANGGAL/WAKTU : SABTU, 18 MARET 2023, 18:55

import java.util.Scanner;

/* Baca N, Print 1 s/d N dengan FOR */
public class PriFor {

	/**
	* @param args
	*/
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		int i, N;
		Scanner masukan=new Scanner (System.in);
		/* Program */
		System.out.print ("Baca N, print 1 s/d N ");
		System.out.print ("N = ");

		N=masukan.nextInt();

		for (i = 1; i <= N; i++){
		System.out.println (i); };
		System.out.println ("Akhir program \n");
	}
} 