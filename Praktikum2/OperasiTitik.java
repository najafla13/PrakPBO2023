/**
 * File 		: OperasiTitik.java 02/03/23
 * Penulis 		: Agnian Naja Aflak
 * Deskripsi 	: kelas yang berisi program untuk membuat method refleksi dan menampilkannya ke layar
 * 
 */ 
 
 class OperasiTitik{
	
	private void refleksiSumbuX(Titik titik){
		double y;
		y = titik.getOrdinat();
		y = y * -1;
		titik.setOrdinat(y);
	}
	
	private void refleksiSumbuY(Titik titik){
		double x;
		x = titik.getAbsis();
		x = x * -1;
		titik.setAbsis(x);
	}
	
	public double refleksiX(Titik t){
		double rx;
		refleksiSumbuX(t);
		rx = t.getOrdinat();
		return rx;
	}
	
	public double refleksiY(Titik t){
		double ry;
		refleksiSumbuY(t);
		ry = t.getAbsis();
		return ry;
	}
	
		
 }
	