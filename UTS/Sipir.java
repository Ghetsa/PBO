package UTS;

import java.util.Scanner;

public class Sipir extends Petugas {
    private String wilayah;
    private int lamaKerja;

    // Constructor
    public Sipir(String nama, String idPetugas, String shiftKerja, String tugasHarian, String wilayah,
            int lamaKerja) {
        super(nama, idPetugas, shiftKerja, tugasHarian);
        this.wilayah = wilayah;
        this.lamaKerja = lamaKerja;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    // Menu untuk menambah Sipir
    public static Sipir buatSipirBaru(Scanner scanner) {
        System.out.print("Masukkan Nama Sipir: ");
        String namaKepala = scanner.nextLine();
        System.out.print("Masukkan ID Sipir: ");
        String idKepala = scanner.nextLine();
        System.out.print("Masukkan Shift Kerja: ");
        String shiftKerja = scanner.nextLine();
        System.out.print("Masukkan Tugas Harian: ");
        String tugasHarian = scanner.nextLine();
        System.out.print("Masukkan Wilayah Tanggung Jawab: ");
        String wilayahTanggungJawab = scanner.nextLine();
        System.out.print("Masukkan Lama Kerja (tahun): ");
        int lamaKerja = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        return new Sipir(namaKepala, idKepala, shiftKerja, tugasHarian, wilayahTanggungJawab, lamaKerja);
    }

    // Melihat informasi Sipir
    public void lihatInfoSipir() {
        System.out.printf("| %-55s |%n", "ID                    : " + getIdPetugas(), "");
        System.out.printf("| %-55s |%n", "Nama Sipir            : " + getNama(), "");
        System.out.printf("| %-55s |%n", "Shift Kerja           : " + getShiftKerja(), "");
        System.out.printf("| %-55s |%n", "Wilayah Tanggung Jawab: " + getWilayah(), "");
        System.out.printf("| %-55s |%n", "Lama Kerja            : " + getLamaKerja() + " tahun", "");

        System.out.println("===========================================================");
    }
}
