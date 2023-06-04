/**
 * File      	: Vehicle.java 05/05/23
 * Penulis 		: Agnian Naja Aflak
 * Deskripsi 	: class sebagai superclass dari Car dan Bus
 *
 */

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}
