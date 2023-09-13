package Koperasi;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        int inputPinjam, inputAngsur;
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman : " + donny.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        System.out.print("Masukkan Nominal Peminjaman : ");
        donny.pinjam(inputPinjam = sc.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 4.000.000...");
        System.out.print("Masukkan Nominal Peminjaman : ");
        donny.pinjam(inputPinjam = sc.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 300.000");
        System.out.print("Masukkan Nominal Angsuran : ");
        donny.angsur(inputAngsur = sc.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000");
        System.out.print("Masukkan Nominal Angsuran : ");
        donny.angsur(inputAngsur = sc.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 3.000.000");
        System.out.print("Masukkan Nominal Angsuran : ");
        donny.angsur(inputAngsur = sc.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    }
}
