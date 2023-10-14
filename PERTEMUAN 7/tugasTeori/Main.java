package tugasTeori;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("*************************************");
            System.out.println("Hitung Luas dan Keliling Bangun Datar");
            System.out.println("*************************************");
            System.out.println("Pilih bangun datar:");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("0. Keluar");
            System.out.println("*************************************");
            System.out.print("Masukkan pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("*************************************");
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    float radius = scanner.nextFloat();
                    Lingkaran lingkaran = new Lingkaran(radius);
                    System.out.println("Luas lingkaran: " + lingkaran.luas());
                    System.out.println("Keliling lingkaran: " + lingkaran.keliling());
                    System.out.println("*************************************");
                    break;

                case 2:
                    System.out.println("*************************************");
                    System.out.print("Masukkan panjang persegi panjang: ");
                    float panjang = scanner.nextFloat();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    float lebar = scanner.nextFloat();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                    System.out.println("Luas persegi panjang: " + persegiPanjang.luas());
                    System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling());
                    break;

                case 3:
                    System.out.println("*************************************");
                    System.out.print("Masukkan alas segitiga: ");
                    float alas = scanner.nextFloat();
                    System.out.print("Masukkan tinggi segitiga: ");
                    float tinggi = scanner.nextFloat();
                    Segitiga segitiga = new Segitiga(alas, tinggi);
                    System.out.println("Luas segitiga: " + segitiga.luas());
                    System.out.println("Keliling segitiga: " + segitiga.keliling());
                    System.out.println("*************************************");
                    break;

                case 0:
                    System.out.println("*************************************");
                    System.out.println("Terima kasih!");
                    System.out.println("*************************************");
                    break;

                default:
                    System.out.println("*************************************");
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    System.out.println("*************************************");
                    break;
            }
        } while (choice != 0);

        scanner.close();

    }

}