package Koperasi;

public class Anggota {
    String no_ktp, nama;
    int limitPinjaman, jumlahPinjaman;

    Anggota(String not_ktp, String nama, int limitPinjaman) {
        this.no_ktp = no_ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if (jumlahPinjaman + nominal > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    public void angsur(int nominal) {
        if (jumlahPinjaman - nominal < 0) {
            System.out.println("Maaf, jumlah angsuran melebihi jumlah pinjaman.");
        } else if (nominal < (0.10 * jumlahPinjaman)) {
            System.out.println("Maaf, Jumlah Angsurang minimal harus 10% dari Jumlah Pinjaman");
        } else {
            jumlahPinjaman -= nominal;
        }
    }
}
