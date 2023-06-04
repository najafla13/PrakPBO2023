/**
 * File      	: Car.java 05/05/23
 * Penulis 		: Agnian Naja Aflak
 * Deskripsi 	: Class untuk Car
 * 
 */

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}

