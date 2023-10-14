package tugasTeori;

public class PersegiPanjang extends BangunDatar {
    public float panjang, lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        float hasilLuas = panjang * lebar;
        return hasilLuas;
    }

    @Override
    public float keliling() {
        float hasilKeliling = 2 * (panjang + lebar);
        return hasilKeliling;
    }
}
