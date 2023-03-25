// NIM : 13020210175
// NAMA : YULIANA NGGOHELE
// HARI/TANGGAL/WAKTU : SABTU, 18 MARET 2023, 17:43

import java.util.Scanner;

public class KasusSwitch {

/**
* @param stubs
*/
public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
	char cc;
	Scanner masukkan=new Scanner(System.in);
	/* Program */
	System.out.print ("Ketikkan sebuah huruf, akhir dengan RETURN \n");
	cc=masukkan.next() .charAt(0);
	switch (cc) {
		case 'a': {System.out.print (" Yang anda ketik adalah a\n"); break;}
		case 'u': {System.out.print (" Yang anda ketik adalah u\n"); break;}
		case 'e': {System.out.print (" Yang anda ketik adalah e\n"); break;}
		case 'i': {System.out.print (" Yang anda ketik adalah i\n"); break;}
		case 'o': {System.out.print (" Yang anda ketik adalah o\n"); break;}
		default : System.out.print (" Yang anda ketik adalah huruf mati\n");
	}
}

}