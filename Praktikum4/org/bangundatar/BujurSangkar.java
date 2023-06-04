/**
 * File 		: BujurSangkar.java 16/03/23
 * Penulis 		: Agnian Naja Aflak
 * Deskripsi 	: kelas yang berisi program untuk membuat class BujurSangkar beserta methodnya.
 * 
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi ;
	}	
}