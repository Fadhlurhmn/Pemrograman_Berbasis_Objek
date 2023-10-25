package soal4;

public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    // a. tambahkan construktor
    // Gunakan construktor untuk
    // mengisi atribut nim, nama, alamat, jenisKelamin
    public Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public void tampilData() {
        System.out.println("=======================");
        System.out.println("Nama\t\t:" + nama);
        System.out.println("NIM\t\t:" + nim);
        System.out.println("Alamat\t\t:" + alamat);
        System.out.println("Jenis Kelamin\t:" + jenisKelamin);
        System.out.println("=======================");

    }

    public static void main(String[] args) {
        // b. buat objek mahasiswa
        // isi atribut nim, nama, alamat, jenisKelamin
        // lewat constructor
        Mahasiswa mhs = new Mahasiswa("2241720081", "Fadhlurohman Al Farabi", "Malang", 'L');
        mhs.tampilData();
    }
}
