public class Mahasiswa {
    String nama;
    String nim;
    int nilai;

    // konstruktor untuk create objek mahasiswa
    Mahasiswa(String nama, String nim, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // fungsi untuk convert nilai ke ipk
    double hitungIPK() {
        if (nilai > 80) {
            return 4;
        } else if (nilai > 73 && nilai <= 80) {
            return 3.5;
        } else if (nilai > 65 && nilai <= 73) {
            return 3;
        } else if (nilai > 60 && nilai <= 65) {
            return 2.5;
        } else if (nilai > 50 && nilai <= 60) {
            return 2;
        } else if (nilai > 39 && nilai <= 50) {
            return 1;
        } else {
            return 0;
        }
    }

    // fungsi untuk convert nilai ke ipk dengan parameter sks
    double hitungIPKDenganSKS(int sks) {
        return (hitungIPK() * sks) / sks;
    }
}