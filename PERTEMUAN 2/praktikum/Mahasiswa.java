package praktikum;

public class Mahasiswa {
    public int nim;
    public String nama;
    public String alamat;
    public String kelas;

    // untuk menampilkan biodata mahasiswa
    public void tampilBiodata() {
        System.out.println("Nim      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Alamat   : " + alamat);
        System.out.println("Kelas    : " + kelas);
    }

}
