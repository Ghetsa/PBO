package UTS;

import java.util.ArrayList;
import java.util.Scanner;

public class Sel {
  private String nomorSel;
  private int kapasitas;
  private ArrayList<Tahanan> daftarTahanan;
  private Petugas petugasJaga; // Tambahkan atribut Petugas yang berjaga
  private static ArrayList<Sel> daftarSel = new ArrayList<>();

  // Constructor
  public Sel(String nomorSel, int kapasitas) {
    this.nomorSel = nomorSel;
    this.kapasitas = kapasitas;
    this.daftarTahanan = new ArrayList<>();
  }

  // Getter and Setter methods
  public String getNomorSel() {
    return nomorSel;
  }

  public void setNomorSel(String nomorSel) {
    this.nomorSel = nomorSel;
  }

  public int getKapasitas() {
    return kapasitas;
  }

  public void setKapasitas(int kapasitas) {
    this.kapasitas = kapasitas;
  }

  // Menetapkan Petugas yang berjaga
  public void tambahPetugasJaga(Petugas petugas) {
    this.petugasJaga = petugas;
    System.out.println("-----------------------------------------------------------");
    System.out.printf("| %-55s |%n", "Petugas " + petugas.getNama() + " berjaga di sel " + nomorSel, "");
    System.out.println("-----------------------------------------------------------");
  }

  public static void tambahSel(Scanner scanner) {
    System.out.println("===========================================================");
    System.out.println("|                       Tambah Sel                        |");
    System.out.println("-----------------------------------------------------------");
    System.out.print("| Masukkan Nomor Sel: ");
    String nomorSel = scanner.nextLine();
    System.out.print("| Masukkan Kapasitas Sel: ");
    int kapasitasSel = scanner.nextInt();
    scanner.nextLine(); // Konsumsi newline

    Sel selBaru = new Sel(nomorSel, kapasitasSel);
    daftarSel.add(selBaru);

    System.out.println("-----------------------------------------------------------");
    System.out.printf("| %-55s |%n", "Sel " + nomorSel + " berhasil ditambahkan dengan kapasitas " + kapasitasSel, "");
    System.out.println("-----------------------------------------------------------");
  }

  // Menambah Tahanan ke Sel
  public void tambahTahanan(Tahanan tahanan) {
    if (daftarTahanan.size() < kapasitas) {
      daftarTahanan.add(tahanan);
      System.out.println("-----------------------------------------------------------");
      System.out.printf("| %-55s |%n", "        Tahanan berhasil ditambahkan ke sel " + nomorSel, "");
      System.out.println("-----------------------------------------------------------");
    } else {
      System.out.println("-----------------------------------------------------------");
      System.out.printf("| %-55s |%n", "               Sel " + nomorSel + " sudah penuh", "");
      System.out.println("-----------------------------------------------------------");
      System.out.println("Sel " + nomorSel + " sudah penuh.");
    }
  }

  // Hapus tahanan dari sel berdasarkan nomor identitas
  public void hapusTahanan(String idTahanan) {
    Tahanan tahananDihapus = null;
    for (Tahanan tahanan : daftarTahanan) {
      if (tahanan.getidTahanan().equals(idTahanan)) {
        tahananDihapus = tahanan;
        break;
      }
    }
    System.out.println("-----------------------------------------------------------");
    if (tahananDihapus != null) {
      daftarTahanan.remove(tahananDihapus);
      System.out.printf("| %-55s |%n", "Tahanan ID " + idTahanan + " berhasil dihapus.", "");
    } else {
      System.out.println("Tahanan tidak ditemukan.");
    }
    System.out.println("-----------------------------------------------------------");

  }

  // Melihat daftar tahanan di sel
  public void lihatTahanan() {
    System.out.println("-----------------------------------------------------------");
    System.out.println("|                 Daftar Tahanan Penjara                  |");
    System.out.println("-----------------------------------------------------------");
    System.out.printf("| %-55s |%n", "Daftar tahanan di Sel " + nomorSel + ": ", "");
    System.out.println("-----------------------------------------------------------");
    if (daftarTahanan.isEmpty()) {
      System.out.println("|             Belum ada tahanan yang terdaftar            |");
      System.out.println("-----------------------------------------------------------");
    } else {
      for (Tahanan tahanan : daftarTahanan) {
        System.out.printf("| %-55s |%n", "ID         : " + tahanan.getidTahanan(), "");
        System.out.printf("| %-55s |%n", "Nama       : " + tahanan.getNama(), "");
        System.out.printf("| %-55s |%n", "Usia       : " + tahanan.getUsia(), "");
        System.out.printf("| %-55s |%n", "Pelanggaran: " + tahanan.getPelanggaran(), "");
        System.out.println("-----------------------------------------------------------");
      }
    }
  }
}
