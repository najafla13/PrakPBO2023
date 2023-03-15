/*
Main 03/03/2023
Penulis 	: Agnian Naja Aflak
Deskripsi 	: Main {Kelas ini berisi metode main() yang merupakan pintu 
			  masuk program. Kelas ini membuat sebuah objek Titik dan 
			  sebuah objek OperasiTitik, kemudian melakukan operasi 
			  mencerminkan pada objek Titik menggunakan metode-metode 
			  yang tersedia di kelas OperasiTitik, dan menampilkan 
			  hasilnya ke layar dengan menggunakan method println() 
			  milik kelas System.out.}
*/

public class Main {
    public static void main(String[] args) {
        // membuat objek Titik
        Titik titik = new Titik(3, 4);

        // membuat objek OperasiTitik
        OperasiTitik operasiTitik = new OperasiTitik();

        // mencerminkan titik terhadap sumbu X
        Titik titikHasilX = operasiTitik.refleksiX(titik);
        System.out.println("Titik sebelum dicerminkan terhadap sumbu X: " + titik);
        System.out.println("Titik setelah dicerminkan terhadap sumbu X: " + titikHasilX);
        
        // mencerminkan titik terhadap sumbu Y
        Titik titikHasilY = operasiTitik.refleksiY(titik);
        System.out.println("Titik sebelum dicerminkan terhadap sumbu Y: " + titik);
        System.out.println("Titik setelah dicerminkan terhadap sumbu Y: " + titikHasilY);
    }
}