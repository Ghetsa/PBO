package UTS;

import java.util.ArrayList;
import java.util.Scanner;

public class Petugas {
    private static ArrayList<Petugas> daftarPetugas = new ArrayList<>();

    private String nama;
    private String idPetugas;
    private String shiftKerja;
    private String tugasHarian;

    // Constructor
    public Petugas(String nama, String idPetugas, String shiftKerja, String tugasHarian) {
        this.nama = nama;
        this.idPetugas = idPetugas;
        this.shiftKerja = shiftKerja;
        this.tugasHarian = tugasHarian;
        daftarPetugas.add(this);
    }

    // Getter and Setter methods
    public static ArrayList<Petugas> getDaftarPetugas() {
        return daftarPetugas;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getShiftKerja() {
        return shiftKerja;
    }

    public void setShiftKerja(String shiftKerja) {
        this.shiftKerja = shiftKerja;
    }

    public String getTugasHarian() {
        return tugasHarian;
    }

    public void setTugasHarian(String tugasHarian) {
        this.tugasHarian = tugasHarian;
    }

    // Method untuk menambah Petugas baru
    public static Petugas petugasBaru(Scanner scanner) {
        System.out.print("| Masukkan Nama Petugas: ");
        String namaPetugas = scanner.nextLine();
        System.out.print("| Masukkan ID Petugas: ");
        String idPetugas = scanner.nextLine();
        System.out.print("| Masukkan Shift Kerja: ");
        String shiftKerja = scanner.nextLine();
        System.out.print("| Masukkan Tugas Harian: ");
        String tugasHarian = scanner.nextLine();

        // Jika semua data valid, buat Petugas baru
        Petugas petugasBaru = new Petugas(namaPetugas, idPetugas, shiftKerja, tugasHarian);
        System.out.println("-----------------------------------------------------------");
        System.out.printf("| %-55s |%n", "        Data petugas berhasil ditambahkan ", "");
        System.out.println("-----------------------------------------------------------");
        return petugasBaru;
    }

    // Method untuk menghapus Petugas berdasarkan ID
    public static void hapusPetugas(String idPetugas) {
        Petugas petugasDihapus = null;
        for (Petugas petugas : daftarPetugas) {
            if (petugas.getIdPetugas().equals(idPetugas)) {
                petugasDihapus = petugas;
                break;
            }
        }
        System.out.println("-----------------------------------------------------------");
        if (petugasDihapus != null) {
            daftarPetugas.remove(petugasDihapus);
            System.out.printf("| %-55s |%n", "Petugas ID " + idPetugas + " berhasil dihapus.", "");
        } else {
            System.out.println("Petugas tidak ditemukan.");
        }
        System.out.println("-----------------------------------------------------------");

    }

    // Method untuk melihat daftar Petugas
    public static void lihatDaftarPetugas() {

        System.out.println("-----------------------------------------------------------");
        System.out.println("|                 Daftar Petugas Penjara                  |");
        System.out.println("-----------------------------------------------------------");
        if (daftarPetugas.isEmpty()) {
            System.out.println("|             Belum ada petugas yang terdaftar            |");
            System.out.println("-----------------------------------------------------------");
        } else {
            for (Petugas petugas : daftarPetugas) {
                System.out.printf("| %-55s |%n", "ID          : " + petugas.getIdPetugas(), "");
                System.out.printf("| %-55s |%n", "Nama        : " + petugas.getNama(), "");
                System.out.printf("| %-55s |%n", "Shift Kerja : " + petugas.getShiftKerja(), "");
                System.out.printf("| %-55s |%n", "Tugas Harian: " + petugas.getTugasHarian(), "");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
}
