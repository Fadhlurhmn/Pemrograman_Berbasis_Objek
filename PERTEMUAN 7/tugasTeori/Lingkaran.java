package tugasTeori;

public class Lingkaran extends BangunDatar {
    public float r;

    public Lingkaran(float jari_jari) {
        r = jari_jari;
    }

    @Override
    public float luas() {
        float hasilLuas = (float) (3.14 * r * r);
        return hasilLuas;
    }

    @Override
    public float keliling() {
        float hasilKeliling = (float) (2 * 3.14 * r);
        return hasilKeliling;
    }

}
