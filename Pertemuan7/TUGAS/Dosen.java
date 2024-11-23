package Pertemuan7.TUGAS;
import java.util.Scanner;
class Dosen extends Pegawai {
    private int jumlahSKS;
    private final int TARIF_SKS = 50000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        return super.getGaji() + (jumlahSKS * TARIF_SKS);
    }
}
