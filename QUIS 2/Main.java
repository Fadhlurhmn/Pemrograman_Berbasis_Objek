public class Main {
    public static void main(String[] args) {
        // Program Utama
        // Buat beberapa objek mahasiswa dan mata kuliah
        Mahasiswa mahasiswa1 = new Mahasiswa("Fadhlurohman", "224172", 85);
        Mahasiswa mahasiswa2 = new Mahasiswa("Al Farabi", "224176", 70);

        MataKuliah matakuliah1 = new MataKuliah("PBO", 3, 85);
        MataKuliah matakuliah2 = new MataKuliah("Basis Data", 4, 70);

        // Simulasikan proses perwalian
        Perwalian perwalian = new Perwalian();
        perwalian.tambahMahasiswa(mahasiswa1);
        perwalian.tambahMahasiswa(mahasiswa2);
        perwalian.tambahMataKuliah(matakuliah1);
        perwalian.tambahMataKuliah(matakuliah2);

        // Cetak hasil perwalian
        perwalian.cetakDataPerwalian();
    }
}