package uas;

public class MobilAngkutanBarang extends Kendaraan{
	void speed(){
		int speed= 60;
		System.out.println("\nMax Speed "+speed+" kmh");
		}
	void weight() {
		int weight=1500;
		System.out.println("Max Weight "+weight+" kg");
	}
	void info() {
		super.warna();
		super.nomor();
		}
}
