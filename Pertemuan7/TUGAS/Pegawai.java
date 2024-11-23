package Pertemuan7.TUGAS;
import java.util.Scanner;

class Pegawai {
    protected String nip;
    protected String nama;
    protected String alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNIP() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public int getGaji() {
        return 3000000;
    }
}