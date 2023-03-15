/*
Titik 21/02/2023
Penulis 	: Agnian Naja Aflak
Deskripsi 	: Titik {Kelas titik merepresentasikan sebuah titik pada koordinat 
			  kartesius dengan atribut absis dan ordinat yang disimpan dalam 
			  tipe data double. Kelas ini memiliki beberapa metode seperti 
			  konstruktor untuk menginisialisasi objek Titik, metode getter 
			  dan setter untuk mengakses dan mengubah nilai atribut absis dan 
			  ordinat, serta metode toString() untuk mengembalikan string yang 
			  merepresentasikan nilai absis dan ordinat dari objek Titik.}
*/
public class Titik {
    private double absis;
    private double ordinat;

    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }
}