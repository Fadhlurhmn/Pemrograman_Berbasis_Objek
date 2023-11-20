### Nama : Fadhlurohman Al Farabi

### Kelas : TI - 2C

<center>Pertanyaan Percobaan 1</center>

1. Class apa sajakah yang merupakan turunan dari class Employee?

   Jawab : Class yang merupakan turunan dari class Employee adalah class IntershipEmployee dan PermannetEmployee.

2. Class apa sajakah yang implements ke interface Payable?

   Jawab : Class yang mengimplementasikan interface Payable adalah class PermanentEmployee dan ElectricityBill/

3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek iEmp (merupakan objek dari class IntershipEmployee)

   Jawab : Pada baris ke-10 dan 11 dari class Tester1 menunjukkan polimorfisme. Pada baris ke-10 e = pEmp merupakan objek dari class Employee yang merupakan class turunannya yaitu PermanentEmployee dan pada baris ke-11 e = iEmp merupakan juga objek dari class Employee yang merupakan class turunannya yaitu IntershipEmployee. Yang dimana hal tersebut merupakan konsep substitusi polimorfism dimana objek dari class turunan dapat digunakan dimanapun objek dari class dasarnya.

4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill)?

   Jawab : Pada baris ke-12 pada objek pEmp dan pada baris ke-13 pada objek eBill merupakan objek yang mengimplementasikan interface Payable sehingga kedua objek tersebut bisa diisi atau digunakan pada interface Payable.

5. Coba tambahkan sintaks :

   p = iEmp;

   e = eBill;

   pada baris 14 dan 15 (baris terakhir dalam method main)! Apa yang menyebabkan error?

   Jawab : Pada baris ke-14 p = iEmp; merupakan objek dari class IntershipEmployee yang tidak mengimplementasikan interface Payable sehingga ketika dideklarasikan sebagai objek interface Payable menyebabkan error. Lalu, pada baris ke-15 e = eBill; merupakan objek dari class ElectricityBill yang bukan merupakan class turunan dari Employee sehingga ketika mendeklarasikan sebagai objek dari class Employee tidak bisa digunakan.

6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!

   Jawab : Dari hasil yang diatas kita bisa mengambil kesimpulan tentang konsep dasar polimorfisme sebagai berikut:

   1. Substitusi Polimorfisme : Dimana pada konsep ini objek dari class turunan dapat dianggap sebagai objek dari class dasarnya. Dari hal tersebut memungkinkan penggunaan fleksibel objek.
   2. Polimorfisme pada Interface : Dimana objek dari class yang mengimplementasikan interface dapat dianggap sebagai objek dari interface tersebut. Sehingga menunjukkan polimorfisme pada tingkat interface dimana objek dari class berbeda dapat digunakan secara seragam melalui interface yang sama.

<center>Pertanyaan Percobaan 2</center>

1. Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?

   Jawab : Karena variabel e dideklarasikan sebagai objek dari class Employee tetapi merujuk pada objek dari class turunan PermanentEmployee. Sehingga meskipun variabel e dideklarasikan sebagai Employee pemanggilan method getEmployeeInfo() akan mengaacu pada implementasi yang ada pada class turunan karena method tersebut di override di dalam class turunan nya.

2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan pEmp.getEmployeeInfo() tidak?

   Jawab : Pemanggilan e.getEmployeeInf() disebut pemanggilan virtual karena JVM (Java Virtual Machine) menentukan method yang seharusnya dipanggil pada saat runtime berdasarkan objek aktual yang ditunjuk oleh variabel referensi('e'). Sedangkan, pada pemanggilan pEmp.getEmployeeInfo() dimana kita tahu secara statis bahwa variabel pEmp adalah objek dari class PermanentEmployee, JVM tidak perlu menentukan method pada saat runtime, sehingga ini tidak dianggap sebagai pemanggilan virtual.

3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual?

   Jawab : Virtual method invocation mengacu pada kemampuan bahasa pemrograman seperti java untuk menentukan metode yang akan dipanggil pada saat runtime berdasarkan objek aktual yang ditunjuk oleh variabel referensi. Hal tersebut disebut virtual karena implementasi metode yang sebenarnya ditentukan pada saat runtime, dan bukan pada saat kompilasi.

<center>Pertanyaan Percobaan 3</center>

1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek iEmp(objek dari IntershipEmployee)?

   Jawab : Pada baris ke-8 array 'e' bisa diisi dengan objek berbeda tipe (PermanentEmployee dan IntershipEmployee) karena keduanya adalah turunan dari class Employee. Dalam hal ini merupakan penerapan konsep polimorfisme, dimana objek dari class turunan dapat dianggap sebagai objek dari class parent. Sehingga objek dari class tersebut bisa dianggap sebagai objek Employee dan dapat menyimpan pada array 'e'.

2. Perhatikan juga baris ke-9, mengapa array p juga bisa diisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling)?

   Jawab : Pada baris ke-9 bisa diisi dengan objek berbeda tipe (PermanentEmployee dan ElectricityBill) karena keduanya mengimplementasikan interface Payable. Dalam java interface memungkinkan objek dari class yang berbeda untuk dianggap sebagai objek dari interface yang sama. Sehingga objek pEmp dan eBill dapat dianggap sebagai objek Payable dalam array 'p'.

3. Perhatikan baris ke-10, mengapa terjadi error?

   Jawab : Pada baris ke-10 terjadi error karena array 'e2' merupakan array dari class Employee dan objek eBill (yang merupakan objek dari class ElectricityBill) tidak merupakan turunan dari class Employee. Sehingga objek dari class yang tidak terkait dengan class Employee tidak dapat disimpan dalam array 'e2' yang dideklarasikan sebagai array Employee. Dari hal tersebut akan menyebabkan error.
