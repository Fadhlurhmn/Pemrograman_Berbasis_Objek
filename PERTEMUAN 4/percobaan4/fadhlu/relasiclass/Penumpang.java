package percobaan4.fadhlu.relasiclass;

public class Penumpang {
    private String ktp, nama;

    Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getKtp() {
        return ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "KTP: " + this.ktp + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
