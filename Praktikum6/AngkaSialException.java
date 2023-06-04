/**
 * File 		: AngkaSialException.java 05/05/23
 * Penulis 		: Agnian Naja Aflak
 * Deskripsi 	: Eksepsi buatan sendiri, menolak masukan angka 13! 
 *
 */
public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
 }