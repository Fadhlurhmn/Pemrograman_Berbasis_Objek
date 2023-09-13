LAPORAN JOBSHEET 2 <br>
PRAKTIKUM PEMROGRAMAN OOP

NAMA : FADHLUROHMAN AL FARABI <br>
KELAS : TI - 2C <br>
NIM : 2241720081<br>

PERCOBAAN 1 <br>
Studi Kasus 1
Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap karyawan memiliki id, nama, jenis kelamin, jabatan, dan gaji. Setiap mahasiswa juga bisa menampilkan data diri pribadi dan melihat gajinya.

1.  Gambar desain class diagram <br>

    ![Alt text](<percobaan 1 pertemuan 2.drawio.png>)

2.  Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!

    Jawab :

        Class yang tersedia ada dua, yaitu class Karyawan dan class Mahasiswa.

3.  Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1!

    Jawab :

        => Attribut Class Karyawan
            - id, nama, jenisKelamin, jabatan : memiliki tipe data String
            - gajiKaryawan : memiliki tipe data double
        => Attribut Class Mahasiswa
            - nama, nim, alamat, jenisKelamin : memiliki tipe data String

4.  Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1!
    Jawab :

        => Method Class Karyawan
            - tampilBiodata() : void
            - melihatGaji() : void
        => Method Class Mahasiswa
            - tampilBiodata() : void

PERCOBAAN 2<br>
STUDI KASUS 2 <br>
![Alt text](<studi kasus 2.drawio.svg>) <br>

Pertanyaan <br>

1.  Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas! <br>

        Jawab : Pendeklarasian atribut terdapat pada Class Mahasiswa yang tertera pada gambar dibawah ini.

    ![Alt text](<percobaan 2 no 1.png>)

2.  Jelaskan pada bagian mana proses pendeklarasian method pada program diatas! <br>

        Jawab : Pendeklarasian method terdapat pada Class Mahasiswa yang tertera pada gambar dibawah ini.

    ![Alt text](<percobaan 2 no 2.png>)

3.  Berapa banyak objek yang diinstansiasi pada program diatas!<br>

        Jawab : Objek yang diinstansiasi hanya ada satu yaitu objek "mhs1".

4.  Apakah yang sebenarnya dilakukan pada sintaks program "mhs1.nim=101"?<br>

        Jawab : Proses tersebut kita memberikan value kepada attribut nim pada objek mhs1.

5.  Apakah yang sebenarnya dilakukan pada sintaks program "mhs1.tampilBiodata()"?

        Jawab : Proses tersebut adalah kita memanggil method tampilBiodata() pada objek mhs1.

6.  Instansiasi 2 objek lagi pada program diatas!
    ![Alt text](<percobaan 2 no 6.png>)

PERCOBAAN 3<br>
PERTANYAAN<br>

1.  Apakah fungsi argumen dalam suatu method?

        Jawab : Fungsi argument dalah sebuah method adalah digunakan untuk inputan data. Jadi, semua method yang memerlukan sebuah data inputan untuk memproses sesuatau maka akan dipermudah dengan menggunakan argument.

2.  Ambil kseimpulan tentang kegunaan dari kata kunci return, dan kapan suatu method harus memiliki return!

        Jawab : Penggunaan return adalah mengembalikan nilai dari hasil suatu method. Jadi, ketika menggunakan tipe selain void pada method akan diperlukan return untuk mengembalikan nilainya. Sehingga ketika dipanggil method tersebut diperlukan sebuah variabel untuk menampung nilai atau value dari hasil return tersebut.
