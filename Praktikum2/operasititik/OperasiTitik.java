/*
HelloWorld 21/02/2023
Penulis 	: Agnian Naja Aflak
Deskripsi 	: OperasiTitik
*/

public class OperasiTitik {

    public void refleksiSumbuX(Titik titik) {
        double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);
    }

	public void refleksiSumbuY(Titik titik) {
        double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
    }
	
	public Titik refleksiX(Titik titik) {
        double y;
        y = titik.getOrdinat();
        y *= -1;
        return new Titik(titik.getAbsis(), y);
    }

    public Titik refleksiY(Titik titik) {
        double x;
        x = titik.getAbsis();
        x *= -1;
        return new Titik(x, titik.getOrdinat());
    }

}
