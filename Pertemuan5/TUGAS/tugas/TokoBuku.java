package Pertemuan5.TUGAS.tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class TokoBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        Pembeli pembeli = null;
        int menu;

        do {
            System.out.println("===========================================================");
            System.out.println("|                    TOKO BUKU DIGITAL                    |");
            System.out.println("===========================================================");
            System.out.println("| Menu:                                                   |");
            System.out.println("| 1. Tambah Buku                                          |");
            System.out.println("| 2. Lihat Daftar Buku                                    |");
            System.out.println("| 3. Beli Buku                                            |");
            System.out.println("| 0. Keluar                                               |");
            System.out.println("-----------------------------------------------------------");
            System.out.print("| Pilih (1/2/3/0): ");
            menu = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (menu) {
                case 1:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                     Tambah Buku Baru                    |");
                    System.out.println("-----------------------------------------------------------");
                    System.out.print("| Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("| Masukkan nama penulis: ");
                    String namaPenulis = scanner.nextLine();
                    System.out.print("| Masukkan negara penulis: ");
                    String negaraPenulis = scanner.nextLine();
                    System.out.print("| Masukkan nama penerbit: ");
                    String namaPenerbit = scanner.nextLine();
                    System.out.print("| Masukkan alamat penerbit: ");
                    String alamatPenerbit = scanner.nextLine();
                    System.out.print("| Masukkan harga buku: ");
                    double harga = scanner.nextDouble();

                    Penulis penulis = new Penulis(namaPenulis, negaraPenulis);
                    Penerbit penerbit = new Penerbit(namaPenerbit, alamatPenerbit);
                    Buku buku = new Buku(judul, penulis, penerbit, harga);
                    daftarBuku.add(buku);
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                Buku berhasil ditambahkan!               |");
                    System.out.println("-----------------------------------------------------------");
                    break;

                case 2:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                     Daftar Buku                         |");
                    System.out.println("-----------------------------------------------------------");
                    if (daftarBuku.isEmpty()) {
                        System.out.println("| Belum ada buku yang tersedia.                            |");
                    } else {
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            System.out.println("| Buku ke-" + (i + 1) + ":");
                            daftarBuku.get(i).tampilkanInfoBuku();
                            System.out.println("-----------------------------------------------------------");
                        }
                    }
                    break;

                case 3:
                    if (pembeli == null) {
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|                 Informasi Pembeli Baru                   |");
                        System.out.println("-----------------------------------------------------------");
                        System.out.print("| Masukkan nama pembeli: ");
                        String namaPembeli = scanner.nextLine();
                        System.out.print("| Masukkan alamat pembeli: ");
                        String alamatPembeli = scanner.nextLine();
                        pembeli = new Pembeli(namaPembeli, alamatPembeli);
                    }

                    if (daftarBuku.isEmpty()) {
                        System.out.println("| Tidak ada buku yang tersedia untuk dibeli.               |");
                    } else {
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|                  Pilih Buku untuk Dibeli                |");
                        System.out.println("-----------------------------------------------------------");
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            System.out.println("| " + (i + 1) + ". " + daftarBuku.get(i).getJudul());
                        }
                        System.out.print("| Pilih nomor buku: ");
                        int nomorBuku = scanner.nextInt();
                        if (nomorBuku >= 1 && nomorBuku <= daftarBuku.size()) {
                            Buku bukuDipilih = daftarBuku.get(nomorBuku - 1);
                            pembeli.beliBuku(bukuDipilih);
                        } else {
                            System.out.println("| Nomor buku tidak valid.                                  |");
                        }
                    }
                    break;

                case 0:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                !!! KELUAR DARI PROGRAM !!!               |");
                    System.out.println("-----------------------------------------------------------");
                    break;

                default:
                    System.out.println("| Pilihan menu salah, silakan coba lagi.                   |");
            }
        } while (menu != 0);

        scanner.close();
    }
}
