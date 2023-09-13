LAPORAN JOBSHEET 3 <br>
PRAKTIKUM PEMROGRAMAN OOP

NAMA : FADHLUROHMAN AL FARABI <br>
KELAS : TI - 2C <br>
NIM : 2241720081<br>

PERTANYAAN<br>

1.  Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan "Kecepatan tidak bisa bertambah karena Mesin Off?"

        Jawab : Dikarenakan kontak atau mesin masih Off. Perhatikan kode program berikut.

    ![Alt text](<pertanyaan 1.a.png>)

        Pada waktu pertama kali mendeklarasikan varibale KontakOn adalah bernilai false atau bisa diartikan mesin dalam kondisi mati. Lalu, pada method tambahKecepatan() memiliki sebuah kondisi bila mesin mati maka akan muncul sebuah peringatan sesuai dengan kode program dibawah ini.

    ![Alt text](<pertanyaan 1.b.png>)

2.  Mengapa atribut kecepatan dan KontakOn diset private?

        Jawab : Untuk menyembunyikan nilai dari variable KontakOn. Sehingga ketika ingin menambahkan kecepatan maka nilai dari variable KontakOn harus bernilai true atau menggunakan method nyalakanMesin().

3.  Ubah class Motor sehingga kecepatan maksimalnya adalah 100!

        Jawab : Untuk membatasi kecepatan maksimal. Kita bisa menambahkan sebuah kondisi pada method tambahKecepatan(). Ketika memanggil method tersebut akan ada pengecekan apakah kecepatan lebih dari 100 atau tidak. Jika tidak, maka kecepatan bisa ditambahkan. Untuk lebih jelasnya perhatikan kode program dibawah ini.

    ![Alt text](<pertanyaan 3.png>)
