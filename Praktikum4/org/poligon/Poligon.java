/**
 * File 		: Poligon.java 23/02/23
 * Penulis 		: Agnian Naja Aflak
 * Deskripsi 	: kelas yang berisi program untuk membuat kelas poligon dan methodnya.
 * 
 */ 

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	public void poligon(){
		this.jumlahSisi = 0;
	}
	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
}