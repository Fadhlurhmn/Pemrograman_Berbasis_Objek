import java.util.ArrayList;

public class Perwalian {
    // array list untuk menyimpan data mahasiswa dan matakuliah
    ArrayList<Mahasiswa> mahasiswaList;
    ArrayList<MataKuliah> mataKuliahList;

    // konstruktor
    Perwalian() {
        mahasiswaList = new ArrayList<>();
        mataKuliahList = new ArrayList<>();
    }

    // fungsi untuk menambah mahasiswa ke dalam array list
    void tambahMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
    }

    // fungsi untuk menambah matakuliah ke dalam array list
    void tambahMataKuliah(MataKuliah mataKuliah) {
        mataKuliahList.add(mataKuliah);
    }

    // fungsi untuk mencetak data informasi pada mahasiswa dan matakuliah
    void cetakDataPerwalian() {
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println("Mahasiswa: " + mahasiswa.nama + " (" + mahasiswa.nim + ")");
            for (MataKuliah mataKuliah : mataKuliahList) {
                System.out.println("  - Mata Kuliah: " + mataKuliah.namaMatakuliah + ", SKS: " + mataKuliah.sks);
                System.out.println("    IPK: " + mahasiswa.hitungIPK() + ", Bobot: " + mataKuliah.hitungBobot());
                System.out.println("    IPK dengan SKS: " + mahasiswa.hitungIPKDenganSKS(mataKuliah.sks));
                System.out.println("    Bobot: " + mataKuliah.hitungBobot());
                System.out.println(
                        "    Bobot dengan Bobot Mahasiswa: " + mataKuliah.hitungBobotDenganBobotMahasiswa(1));

            }
            System.out.println("\n");
        }
    }
}