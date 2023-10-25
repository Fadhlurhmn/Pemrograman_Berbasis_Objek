package soal5;

public class Main {
    public static void main(String[] args) {
        Penulis penulis = new Penulis();
        Buku buku = new Buku();

        penulis.setNama("Fadhlurohman");
        penulis.setAlamat("Malang");
        buku.setISBN("FAD01");
        buku.setJudul("Pemrograman Berbasis Objek");
        buku.setHarga(20000);
        buku.setPenulis(penulis);

        System.out.println("========Data Buku========");
        System.out.println("\nPenulis");
        System.out.println("Nama\t:" + buku.getPenulis().nama);
        System.out.println("Alamat\t:" + buku.getPenulis().alamat);
        System.out.println("\nBuku");
        System.out.println("Judul\t:" + buku.getJudul());
        System.out.println("ISBN\t:" + buku.getISBN());
        System.out.println("Harga\t:" + buku.getHarga());
        System.out.println("=========================");
    }
}
