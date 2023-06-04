/**
 * File 		: Titik.java 2/02/23
 * Penulis 		: Agnian Naja Aflak
 * Deskripsi 	: kelas yang berisi program untuk membuat data koordinat Titik dan menampilkannya ke layar
 * 
 */ 
 
 class Titik{
	double absis; //absis
	double ordinat; //ordinat
	static int counterTitik; //penghitung objek titik yang telah dibuat
	
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	public Titik(double a, double b){
		counterTitik++;
		absis = a;
		ordinat = b;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}

 }
 