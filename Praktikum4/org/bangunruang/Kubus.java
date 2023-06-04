/**
 * File 		: Kubus.java 23/02/23
 * Penulis 		: Agnian Naja Aflak
 * Deskripsi 	: kelas yang berisi program untuk membuat kelas kubus dan methodnya.
 * 
 */ 

package org.bangunruang ;

import org.bangundatar.BujurSangkar ;

public class Kubus {
	private BujurSangkar permukaan ;
	public Kubus(BujurSangkar permukaan){
		 this.permukaan = permukaan ;
	}
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi() ;
		return panjangSisi * panjangSisi * panjangSisi ;
	}

	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi() ;
		return panjangSisi * panjangSisi ;
	}
}