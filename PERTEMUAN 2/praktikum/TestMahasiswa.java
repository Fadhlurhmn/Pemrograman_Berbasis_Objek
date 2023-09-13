package praktikum;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(); // buat objek mhs1
        Mahasiswa mhs2 = new Mahasiswa(); // buat objek mhs2
        Mahasiswa mhs3 = new Mahasiswa(); // buat objek mhs3

        // mhs1
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        // mhs2
        mhs2.nim = 202;
        mhs2.nama = "Ayu";
        mhs2.alamat = "Jl. Semanggi Timur No 10";
        mhs2.kelas = "1C";
        mhs2.tampilBiodata();

        // mhs3
        mhs3.nim = 303;
        mhs3.nama = "Rani";
        mhs3.alamat = "Jl. Semanggi Barat No 30";
        mhs3.kelas = "1D";
        mhs3.tampilBiodata();

    }

}
