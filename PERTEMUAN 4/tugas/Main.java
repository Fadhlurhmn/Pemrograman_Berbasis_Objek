package tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi data anggota, buku, dan petugas
        Anggota[] anggota = {
                new Anggota("A001", "Alice"),
                new Anggota("A002", "Bob"),
                new Anggota("A003", "Charlie")
        };

        Buku[] buku = {
                new Buku("B001", "Java Programming", "John Smith", 5),
                new Buku("B002", "Python Basics", "Alice Johnson", 3),
                new Buku("B003", "Web Development", "Bob Williams", 7)
        };

        Petugas petugas = new Petugas("P001", "Peter");

        // Inisialisasi objek PinjamBuku
        PinjamBuku pinjamBuku = new PinjamBuku(anggota, buku);

        // Menu
        while (true) {
            System.out.println("\n===== Perpustakaan XYZ =====");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n== Peminjaman Buku ==");
                    pinjamBuku.pinjam();
                    break;
                case 2:
                    System.out.println("\n== Pengembalian Buku ==");
                    pinjamBuku.kembali();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
                    break;
            }
        }
    }
}
