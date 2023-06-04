/**
 * File 		: Mtitik.java 02/03/23
 * Penulis 		: Agnian Naja Aflak
 * Deskripsi 	: Mtitik
 * 
 */
class Mtitik {
    public static void main(String[] args) {
        Titik t1, t2;
        t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

	t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        System.out.println("t1 absis " + t1.getAbsis() + " t1 ordinat " + t1.getOrdinat());
		System.out.println("t2 absis " + t2.getAbsis() + " t2 ordinat " + t2.getOrdinat());
    }
}
