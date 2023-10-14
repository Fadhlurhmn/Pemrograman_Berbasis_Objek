NAMA : FADHLUROHMAN AL FARABI <br>
KELAS : TI-2C <br>
<br>

PERCOBAAN 1 <BR>
SOURCE CODE <BR>

<center>CLASS classA</center>

![Alt text](percobaan1/classA.png)

<center>CLASS classB</center>

![Alt text](percobaan1/classB.png)

<center>CLASS Percobaan1</center>

![Alt text](percobaan1/percobaan1.png)

<CENTER>PERTANYAAN</CENTER>

1.  Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

            Jawab : Untuk debugging pada percobaan 1 kita perlu memperbaiki sumber masalah nya yaitu pada class classB. Yang dimana kita perlu menambahkan relasi pewarisan dengan menggunakan extends seperti pada gambar dibawah ini.

    <center>Source code</center>

![Alt text](percobaan1/classB_2.png)

<center>Output</center>

![Alt text](percobaan1/output1.png)

2.  Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

        Jawab : Error terjadi dikarenakan pada classB dan classA tidak memiliki relasi. Sehingga ketika objek yang dibuat dari classB pada class Percobaan1 mencoba mengakses method atau atribut pada classA tidak akan bisa.

![Alt text](percobaan1/error.png)

PERCOBAAN 2 <BR>
SOURCE CODE <BR>

<center>CLASS classA</center>

![Alt text](percobaan2/classA.png)

<center>CLASS classB</center>

![Alt text](percobaan2/classB.png)

<center>CLASS Percobaan2</center>

![Alt text](percobaan2/percobaan2.png)

<CENTER>PERTANYAAN</CENTER>

1.  Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

        Jawab : Pada Percobaan 2 diatas terdapat masalah pada ClassB ketika mengakses atribut parent nya pada ClassA dikarenakan pada atribut ClassA memiliki akses private. Sehingga pada ClassA diperlukan sebuah method untuk mengakses atribut tersebut. Lalu, diperlukan relasi antara ClassA dan ClassB. Perhatikan kode program berikut.

    <center>Source code</center>
    <center>ClassA</center>

![Alt text](percobaan2/classA_2.png)

<center>ClassB</center>

![Alt text](percobaan2/classB_2.png)

<center>Output</center>

![Alt text](percobaan2/outputBenar.png)

2.  Jelaskan apa penyebab program pada percobaan 2 ketika dijalankan terdapat error!

        Jawab : Error terjadi dikarenakan pada ClassB dan ClassA tidak memiliki relasi dan pada atribut ClassA memiliki sebuah atribut dengan hak akses private. Sehingga ketika mengakses langsung atribut tersebut tidak akan bisa. Oleh karena itu, diperlukan sebuah method tambahan untuk mengakses atribut tersebut.

PERCOBAAN 3 <BR>
SOURCE CODE <BR>

<center>CLASS Bangun</center>

![Alt text](percobaan3/bangun.png)

<center>CLASS Tabung</center>

![Alt text](percobaan3/tabung.png)

<center>CLASS Percobaan3</center>

![Alt text](percobaan3/percobaan3.png)

<center>OUTPUT</center>

![Alt text](percobaan3/output.png)

<CENTER>PERTANYAAN</CENTER>

1.  Jelaskan fungsi "super" pada potongan program berikut di class Tabung!

![Alt text](percobaan3/soal1.png)

        Jawab : Penggunaan Kata kunci super dipakai untuk merujuk pada member dari parent class. Jadi, pada "super.phi = phi" adalah kita merujuk pada Class Parentnya adalah Class Bangun dengan variabel yang kita target adalah phi. Lalu, pada "super.r = r" juga sama kita merujuk pada Class Parentnya adalah Class Bangun dengan variabel yang kita target adalah r.

2.  Jelaskan fungsi "super" dan "this" pada potongan program berikut di class Tabung!

![Alt text](percobaan3/soal2.png)

        Jawab : Fungsi "super" untuk merujuk pada member dari parent class. Sedangkan "this" merujuk pada member dari class itu sendiri. Jadi, pada "super.phi" dan "super.r" kita merujuk pada parent class yaitu class Bangun dengan member phi dan r. Lalu, pada "this.t" kita merujuk pada class itu sendiri yaitu class Tabung dengan atribut t.

3.  Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut "phi" dan "r" tetapi class tersebut dapat mengakses atribut tersebut!

        Jawab : Karena class Tabung merupakan hasil pewarisan dari class Bangun. Yang dimana class Tabung bisa mengakses atribut atau method yang ada pada class Bangun tanpa perlu mendeklarasikan pada class Tabung sendiri. Jadi, hanya tinggal memanggil saja atribut atau method yang dibutuhkan dari class Bangun.

PERCOBAAN 4 <BR>
SOURCE CODE <BR>

<center>CLASS ClassA</center>

![Alt text](percobaan4/ClassA.png)

<center>CLASS ClassB</center>

![Alt text](percobaan4/ClassB.png)

<center>CLASS ClassC</center>

![Alt text](percobaan4/ClassC.png)

<center>CLASS Percobaan4</center>

![Alt text](percobaan4/Percobaan4.png)

<center>OUTPUT</center>

![Alt text](percobaan4/outptu.png)

<CENTER>PERTANYAAN</CENTER>

1.  Pada percobaan 4, sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya!

        Jawab :
        a. ClassA
        - ClassA adalah superclass dalam hierarki ini.
        - ClassA tidak meng-extend (mewarisi) dari kelas lain.
        - ClassA adalah kelas dasar atau paling atas dalam hierarki ini.
        - Tidak ada kelas yang meng-extend dari ClassA.

        b. ClassB
        - ClassB adalah subclass dari ClassA.
        - ClassB meng-extend (mewarisi) dari ClassA.
        - Ini berarti ClassB mewarisi sifat dan perilaku dari ClassA.
        - ClassB adalah anak dari ClassA dalam hierarki ini.

        c. ClassC
        - ClassC adalah subclass dari ClassB.
        - ClassC meng-extend (mewarisi) dari ClassB.
        - Dengan demikian, ClassC secara tidak langsung juga merupakan subclass dari ClassA melalui rantai pewarisan (inheritance) dari ClassB.
        - Ini berarti ClassC mewarisi sifat dan perilaku dari ClassA melalui ClassB.
        - ClassC adalah cucu dari ClassA dalam hierarki ini.

        Dari penjelasan diatas didapat sebuah rangkuman berikut
        - ClassA adalah superclass (kelas induk).
        - ClassB adalah subclass dari ClassA.
        - ClassC adalah subclass dari ClassB dan secara tidak langsung juga merupakan subclass dari ClassA melalui pewarisan (inheritance) dari ClassB.

2.  Ubahlah isi konstruktor default ClassC seperti berikut

![Alt text](percobaan4/soalno2.png)

Tambahkan kata super() di baris Pertaman dalam konstruktor defaultnya. Coba jalankan kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya!

Source Code

![Alt text](percobaan4/answer2.png)

Output

![Alt text](percobaan4/outptu.png)

3.  Ubah isi konstruktor default ClassC seperti berikut:

![Alt text](percobaan4/soalno3.png)

Ketika mengubah posisi super() dibaris kedua dalam konstruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang.

Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output seperti berikut pada saat instansiasi objek test dari class ClassC

![Alt text](percobaan4/soalno3_2.png)

Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!

        Jawab : Jadi urutan prosesnya seperti berikut
        a. Objek test dibuat menggunakan konstruktor ClassC. Oleh karena itu, konstruktor ClassC akan dijalankan terlebih dahulu.
        b. Dalam konstruktor ClassC, terdapat pemanggilan super(), yang mengakibatkan pemanggilan konstruktor dari kelas induk, yaitu ClassB. Oleh karena itu, konstruktor ClassB dijalankan sebelum kembali ke konstruktor ClassC.
        c. Konstruktor ClassB memanggil super(), yang kembali memanggil konstruktor dari kelas induk teratas, yaitu ClassA. Oleh karena itu, konstruktor ClassA dijalankan terlebih dahulu.
        d. Konstruktor ClassA mencetak pesan "Konstruktor A dijalankan."
        e. Setelah konstruktor ClassA selesai dijalankan, program kembali ke konstruktor ClassB, yang kemudian mencetak pesan "Konstruktor B dijalankan."
        f. Kemudian, program melanjutkan ke konstruktor ClassC dan mencetak pesan "Konstruktor C dijalankan."

4. Apakah fungsi super() pada potongan program dibawah ini di ClassC!

![Alt text](percobaan4/soalno4.png)

        Jawab : Kata kunci super() digunakan untuk memanggil konstruktor dari kelas induk (superclass) dalam kelas turunan (subclass). Dengan kata lain, super() memastikan bahwa konstruktor kelas induk dijalankan sebelum konstruktor kelas turunan dalam rantai pewarisan.
