package tugas;

public class Petugas {
    private String id, nama;

    public Petugas(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public Petugas() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String infoPetugas() {
        String info = "";
        info += "Nama Petugas   : " + nama;
        info += "ID Petugas     : " + id;
        return info;
    }
}
