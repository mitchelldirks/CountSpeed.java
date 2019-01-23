package uas;

public class MobilPenumpang extends Kendaraan{
	void speed(){
		int speed= 100;
		System.out.println("\nMax Speed "+speed+" kmh");
		}
	void weight() {
		int weight=1000;
		System.out.println("Max Weight "+weight+" kg");
	}
	void info() {
		super.warna();
		super.nomor();
		}
}
