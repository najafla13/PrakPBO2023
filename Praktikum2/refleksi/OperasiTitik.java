/*
OperasiTitik 26/02/2023
Penulis 	: Agnian Naja Aflak
Deskripsi 	: OperasiTitik {Kelas ini berisi implementasi operasi-operasi 
			  geometri pada objek Titik, seperti mencerminkan objek Titik 
			  terhadap sumbu x dan y. Kelas ini memiliki metode refleksiSumbuX() 
			  dan refleksiSumbuY() yang digunakan untuk melakukan operasi 
			  mencerminkan pada objek Titik, dan juga metode refleksiX() 
			  dan refleksiY() yang mengembalikan objek Titik hasil operasi 
			  mencerminkan terhadap sumbu x dan y.}
*/

public class OperasiTitik {
    public void refleksiSumbuX(Titik titik) {
        double y = titik.getOrdinat();
        y *= -1;
        titik.setOrdinat(y);
    }

    public void refleksiSumbuY(Titik titik) {
        double x = titik.getAbsis();
        x *= -1;
        titik.setAbsis(x);
    }

    public Titik refleksiX(Titik titik) {
        double y = titik.getOrdinat();
        y *= -1;
        Titik titikHasil = new Titik(titik.getAbsis(), y);
        return titikHasil;
    }

    public Titik refleksiY(Titik titik) {
        double x = titik.getAbsis();
        x *= -1;
        Titik titikHasil = new Titik(x, titik.getOrdinat());
        return titikHasil;
    }
}