package tugas;

public class Anggota {
    private String id, nama;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public void infoAnngota() {
        System.out.println("Nama Anggota    : " + nama);
        System.out.println("ID Anggota      : " + id);

    }

}