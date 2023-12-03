public class MataKuliah {
    String namaMatakuliah;
    int sks;
    int nilaiMahasiswa;

    // konstruktor untuk create objek mata kuliah
    MataKuliah(String namaMatakuliah, int sks, int nilaiMahasiswa) {
        this.namaMatakuliah = namaMatakuliah;
        this.sks = sks;
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    // fungsi hitung bobot mata kuliah berdasarkan nilai mahasiswa
    double hitungBobot() {
        return nilaiMahasiswa * sks;
    }

    // fungsi hitung bobot mata kuliah berdasarkan tambahan bobot mahasiswa
    double hitungBobotDenganBobotMahasiswa(double bobotMahasiswa) {
        return nilaiMahasiswa * sks * bobotMahasiswa;
    }
}