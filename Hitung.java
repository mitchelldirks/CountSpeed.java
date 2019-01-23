package uas;

import java.util.Scanner;


import uas.Motor;
import uas.MobilPenumpang;
import uas.MobilAngkutanBarang;

public class Hitung {
	public static void main(String []args) {
	
	System.out.println("1. Sepeda Motor.");
	System.out.println("2. Mobil Penumpang.");
	System.out.println("3. Mobil Angkutan Barang.");
	System.out.print("Masukan Jenis Kendaraan: ");
	Scanner jenis = new Scanner(System.in);
	int opsi = jenis.nextInt();

	System.out.print("");
	
	if(opsi==1) {
		Motor motor = new Motor();
		motor.speed();
		motor.weight();
		motor.info();
		double mps=80;
		
		System.out.print("\nMasukan Jarak (km): ");
		Scanner length = new Scanner(System.in);
		int jarak = length.nextInt();
		double detik=jarak/mps;
		double waktu=detik;
		System.out.println("Waktu yang diperlukan untuk menempuh jarak "+jarak+" Kilometer adalah "+waktu+" Jam");
		
	}
	if(opsi==2) {

		MobilPenumpang MP = new MobilPenumpang();
		MP.speed();
		MP.weight();
		MP.info();
		double mps=100;
		
		System.out.print("\nMasukan Jarak (KM): ");
		Scanner length = new Scanner(System.in);
		int jarak = length.nextInt();
		double detik=jarak/mps;
		double waktu=detik;
		System.out.println("Waktu yang diperlukan untuk menempuh jarak "+jarak+" Kilometer adalah "+waktu+" jam");
		
	}
	if(opsi==3) {

		MobilAngkutanBarang MAB = new MobilAngkutanBarang();
		MAB.speed();
		MAB.weight();
		MAB.info();
		double mps=60;
		
		System.out.print("\nMasukan Jarak (km): ");
		Scanner length = new Scanner(System.in);
		int jarak = length.nextInt();
		double detik=jarak/mps;
		double waktu=detik;

		System.out.println("Waktu yang diperlukan untuk menempuh jarak "+jarak+" Kilometer adalah "+waktu+" jam");
		//System.out.println("Waktu yang diperlukan untuk menempuh jarak "+jarak+" Kilometer adalah "+waktu+" menit");
		
	}
	if(opsi>3) {
		System.out.println("Salah pilih cuyy");
	}
	
	
	
	}
}
