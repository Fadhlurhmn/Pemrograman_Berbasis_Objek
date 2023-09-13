package tugas;

public class Lingkaran {
    Double phi, r;

    Double hitungLuas() { // untuk menghitung luas lingkaran
        return phi * r * r;
    }

    Double hitungKeliling() { // untuk menghitung keliling lingkaran
        return phi * 2 * r;
    }

    public static void main(String[] args) {
        Lingkaran ln1 = new Lingkaran();
        ln1.phi = 3.14;
        ln1.r = 7.0;
        System.out.println("Luas Lingkaran : " + ln1.hitungLuas());
        System.out.println("Luas Lingkaran : " + ln1.hitungKeliling());
    }
}