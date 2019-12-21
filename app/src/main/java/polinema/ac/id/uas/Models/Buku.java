package polinema.ac.id.uas.Models;

public class Buku {
    private String judul;
    private int gambar;
    private float harga;

    public Buku() {
    }

    public Buku(String judul, int gambar, float harga) {
        this.judul = judul;
        this.gambar = gambar;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
}
