package UTS;

import java.util.Scanner;
import java.util.ArrayList;

public class Tahanan {
    // Scanner scanner = new Scanner(System.in);
    private static ArrayList<Tahanan> daftarTahanan = new ArrayList<>();

    private String nama;
    private int usia;
    private String idTahanan;
    private int durasiHukuman;
    private String pelanggaran;

    // Constructor
    public Tahanan(String nama, int usia, String idTahanan, int durasiHukuman, String pelanggaran) {
        this.nama = nama;
        this.usia = usia;
        this.idTahanan = idTahanan;
        this.durasiHukuman = durasiHukuman;
        this.pelanggaran = pelanggaran;
    }

    // Getter and Setter methods
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getidTahanan() {
        return idTahanan;
    }

    public void setidTahanan(String idTahanan) {
        this.idTahanan = idTahanan;
    }

    public int getDurasiHukuman() {
        return durasiHukuman;
    }

    public void setDurasiHukuman(int durasiHukuman) {
        this.durasiHukuman = durasiHukuman;
    }

    public String getPelanggaran() {
        return pelanggaran;
    }

    public void setPelanggaran(String pelanggaran) {
        this.pelanggaran = pelanggaran;
    }

    public static Tahanan tahananBaru(Scanner scanner) {
        System.out.print("| Masukkan Nomor Identitas Tahanan: ");
        String idTahananTahanan = scanner.nextLine();
        System.out.print("| Masukkan Nama Tahanan: ");
        String namaTahanan = scanner.nextLine();
        System.out.print("| Masukkan Usia Tahanan: ");
        int usiaTahanan = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline
        System.out.print("| Masukkan Durasi Hukuman (tahun): ");
        int durasiHukuman = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline
        System.out.print("| Masukkan Pelanggaran: ");
        String pelanggaran = scanner.nextLine();

        return new Tahanan(namaTahanan, usiaTahanan, idTahananTahanan, durasiHukuman, pelanggaran);
    }

}