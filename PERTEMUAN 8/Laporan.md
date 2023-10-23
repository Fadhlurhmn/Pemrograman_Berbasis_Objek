# LAPORAN JOBSHEET 6

_Fadhlurohman Al Farabi TI - 2C_

## PERNTANYAAN PERCOBAAN 1

1.  Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas !

        Jawab : Yang termasuk ke dalam super class adalah class Karyawan. Sedangkan sub classnya adalah class Manajer dan Staff.

2.  Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain ?

        Jawab : Untuk menurukan suatu class ke class yang lain kata kuncinya adalah extends.

3.  Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan !

        Jawab : Atribut yang diwariskan adalah nama, alamat, jk, umur dan gaji.

4.  Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager !

        _System.out.println("Total Gaji = "+(super.gaji+tunjangan));_


        Jawab : Kata kunci super digunakan untuk merujuk pada super class nya yaitu class Karyawan dan mentarget ke arah atribut gaji. Jadi, intinya adalah untuk mengakses atribut gaji pada class Karyawan.

5.  Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya!

        Jawab : Pada percobaan 1 termasuk ke dalam jenis inheritance Hierarcichal Inheritance. Dikarenakan pada jenis inheritance tersebut terjadi ketika sebuah class memiliki lebih dari satu kelas turunan (subclass). Sesuai dengan yang terjadi pada percobaan 1.

## PERTANYAAN PERCOBAAN 2

1.  Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance ?

        Jawab : Untuk yang termasuk ke dalam single inheritance adalah antara class Karyawan dan class Manager.
        Lalu, untuk yang termasuk ke dalam multilevel inheritance adalah class Karyawan - class Staff dan class StaffTetap & class StaffHarian.

2.  Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!

        Jawab : Atribut yang diwarisi dari class Staff adalah lembur dan potongan. Namun, karena class Staff adalah subclass dari class Karyawan. Maka, atribut dari class Karyawan terwariskan hingga ke class StaffTetap dan class StaffHarian secara tidak langsung.

3.  Apakah fungsi potongan program berikut pada class StaffHarian _super(nama,alamat,jk, umur, gaji, lembur, potongan);_

        Jawab : Untuk merujuk pada class super atau parentnya yang dimana nantinya akan mengakses atribut yang ada didalam parameternya.

4.  Apakah fungsi potongan program berikut pada class StaffHarian(super.tampilDataStaff());

        Jawab : Untuk mengakses method tampilDataStaff() pada class super nya yaitu pada class Staff.

5.  Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap
    _System.out.println("Gaji Bersih ="+(gaji+lembur-potongan-asuransi));_
    Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji, lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur, dan potongan?

        Jawab : Potongan kode berikut masih bisa diakses dikarenakan terjadi pewarisan kepada class StaffTetap dari class Staff pada atribut lembur dan potongan. Lalu, pada atribut gaji diwariskan secara tidak langsung dari class Karyawan.
