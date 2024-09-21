package Pertemuan3;

public class Karyawan {
  String id, nama, jabatan;
  char jenisKelamin;
  long gaji;

  public Karyawan(String id, String nama, String jabatan, char jenisKelamin, long gaji) {
    this.id = id;
    this.nama = nama;
    this.jabatan = jabatan;
    this.jenisKelamin = jenisKelamin;
    this.gaji = gaji;
  }

  public void TampilDataDiri () {
    System.out.println("===============================================");
    System.out.println("|            Tampil Data Karyawan             |");
    System.out.println("===============================================");
    System.out.printf("| %-43s |%n", "ID: " + id, "");
    System.out.printf("| %-43s |%n", "Nama: " + nama, "");
    System.out.printf("| %-43s |%n", "Jabatan: " + jabatan, "");
    System.out.printf("| %-43s |%n", "Jenis Kelamin: " + jenisKelamin, "");
    System.out.println("===============================================");
    
  }

  public void TampilGaji() {
    System.out.println("===============================================");
    System.out.println("|            Tampil Gaji Karyawan             |");
    System.out.println("===============================================");
    System.out.printf("| %-43s |%n", "Nama: " + nama, "");
    System.out.printf("| %-43s |%n", "Gaji: " + gaji, "");
    System.out.println("===============================================");
  }
}
