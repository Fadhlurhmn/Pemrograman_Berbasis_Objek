package soal2;

public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = { { 1, 1, 4 }, { 2, 1, 2 }, { 3, 2, 1 } };
        // hitung jumlah elemen array 2 dimensi
        // gunakan perulangan
        int counter = 0; // variabel untuk menghitung jumlah elemen
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                counter++;
            }
        }
        System.out.println("Total Elemen Array adalah : " + counter);
    }
}
