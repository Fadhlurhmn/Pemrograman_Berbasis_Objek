package tugas;

public class Buku {
    private String id, judul, pengarang;
    private int jumlah;
    public int[] bukuDipinjam;

    public Buku(String id, String judul, String pengarang, int jumlah) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlah = jumlah;
    }

    public Buku() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void kenaPinjam(int jumlah) {
        this.jumlah -= jumlah;
    }

    public void dibalikin(int jumlah) {
        this.jumlah += jumlah;
    }

    public void infoBuku() {

        System.out.println("Judul Buku  : " + judul);
        System.out.println("ID Buku     : " + id);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Jumlah      : " + jumlah);
        // System.out.println("=========================");
    }

}
