package tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class PinjamBuku {
    private Anggota[] anggota;
    private Buku[] buku;
    private ArrayList<Buku> bukuDipinjam;
    private Scanner sc = new Scanner(System.in);

    public PinjamBuku(Anggota[] anggota, Buku[] buku) {
        this.anggota = anggota;
        this.buku = buku;
        bukuDipinjam = new ArrayList<>();
    }

    public void pinjam() {
        System.out.print("Masukkan ID Anggota : ");
        String idAnggota = sc.next();
        Anggota peminjam = null;

        for (Anggota anggota2 : anggota) {
            if (idAnggota.equals(anggota2.getId())) {
                peminjam = anggota2;
                break;
            }
        }

        if (peminjam != null) {
            pilihBuku();
            System.out.print("Masukkan Pilihan : ");
            int inputPilihan = sc.nextInt();
            System.out.print("Masukkan Jumlah Pinjam : ");
            int jumlahPinjam = sc.nextInt();

            Buku bukuPinjam = buku[inputPilihan - 1];
            if (bukuPinjam.getJumlah() >= jumlahPinjam) {
                bukuPinjam.kenaPinjam(jumlahPinjam);
                bukuDipinjam.add(bukuPinjam);
                System.out.println("Buku berhasil dipinjam.");
            } else {
                System.out.println("Stok buku tidak mencukupi.");
            }
        } else {
            System.out.println("ID Anggota tidak valid.");
        }
    }

    public void pilihBuku() {
        int i = 0;
        for (Buku buku2 : buku) {
            i++;
            System.out.println("=========================");
            System.out.println("Buku " + i);
            buku2.infoBuku();
            System.out.println("=========================");
        }
        System.out.println();
    }

    public void kembali() {
        System.out.print("Masukkan ID Anggota : ");
        String idAnggota = sc.next();

        Anggota peminjam = null;

        for (Anggota anggota2 : anggota) {
            if (idAnggota.equals(anggota2.getId())) {
                peminjam = anggota2;
                break;
            }
        }

        if (peminjam != null) {
            System.out.print("Masukkan jenis buku yang akan dikembalikan: ");
            String jenisBuku = sc.next();

            // Cari buku yang sesuai dengan jenis buku yang ingin dikembalikan
            for (Buku bukuPinjam : bukuDipinjam) {
                if (bukuPinjam.getId().equals(jenisBuku)) {
                    bukuPinjam.dibalikin(1);
                    System.out.println("Buku berhasil dikembalikan.");
                    return; // Keluar dari metode setelah buku berhasil dikembalikan
                }
            }

            System.out.println("Jenis buku tidak ditemukan dalam daftar buku yang dipinjam.");
        } else {
            System.out.println("ID Anggota tidak valid.");
        }
    }
}
