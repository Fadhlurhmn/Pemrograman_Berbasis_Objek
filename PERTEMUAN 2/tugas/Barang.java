package tugas;

public class Barang {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;

    int hitungHargaJual() { // untuk menghitung harga jual
        return (int) (hargaDasar - (diskon * hargaDasar));
    }

    void tampilData() { // untuk menampilkan data barang
        System.out.println("************************");
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Kode Barang : " + kode);
        System.out.println("Harga Dasar:" + hargaDasar);
        System.out.println("Diskon : " + diskon);
        System.out.println("Harga Jual: " + hitungHargaJual());
        System.out.println("************************");
    }

    public static void main(String[] args) {
        Barang brg1 = new Barang(); // membuat objek brg1
        brg1.namaBarang = "Laptop";
        brg1.kode = "LP01";
        brg1.hargaDasar = 5000000;
        brg1.diskon = 0.5f;
        brg1.tampilData();
    }
}
