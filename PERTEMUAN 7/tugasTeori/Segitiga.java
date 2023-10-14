package tugasTeori;

public class Segitiga extends BangunDatar {
    public float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        float hasilLuas = (float) (0.5 * alas * tinggi);
        return hasilLuas;
    }

    @Override
    public float keliling() {
        float sisi3 = (float) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        float hasilKeliling = (float) alas + tinggi + sisi3;
        return hasilKeliling;
    }
}
