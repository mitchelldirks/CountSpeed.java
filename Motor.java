package uas;

public class Motor extends Kendaraan {
	void speed(){
		
		int speed= 80;
		System.out.println("\nMax Speed "+speed+" kmh");
		}
	void weight() {
		int weight=50;
		System.out.println("Max Weight "+weight+" kg");
	}
	void info() {
	super.warna();
	super.nomor();
	}
}
