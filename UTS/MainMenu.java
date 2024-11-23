package UTS;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    // List untuk menyimpan sel-sel yang telah dibuat
    private static ArrayList<Sel> daftarSel = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;

        // Variabel untuk menyimpan data
        Sipir Sipir = new Sipir("Pak Surya", "K001", "Pagi", "Pengawasan", "Wilayah Utara", 10);

        while (stop) {
            // Tampilkan menu
            System.out.println("===========================================================");
            System.out.println("|          Sistem Informasi Administrasi Penjara          |");
            System.out.println("===========================================================");
            System.out.printf("| %-55s |%n", "1. Menu Tahanan", "");
            System.out.printf("| %-55s |%n", "2. Menu Petugas", "");
            System.out.printf("| %-55s |%n", "3. Tambah Sel", "");
            System.out.printf("| %-55s |%n", "4. Informasi Sipir", "");
            System.out.printf("| %-55s |%n", "0. Keluar", "");
            System.out.println("===========================================================");
            System.out.print("| Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    // Menu Tahanan
                    if (daftarSel.isEmpty()) {
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|    Tidak ada sel. Harap tambahkan sel terlebih dahulu!   |");
                        System.out.println("-----------------------------------------------------------");
                        break;
                    }
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|                       Pilihan Sel                       |");
                    System.out.println("-----------------------------------------------------------");
                    for (int i = 0; i < daftarSel.size(); i++) {
                        System.out.printf("| %-55s |%n", (i + 1) + ". Sel " + daftarSel.get(i).getNomorSel(), "");
                    }
                    System.out.println("-----------------------------------------------------------");
                    System.out.print("| Pilih Sel: ");
                    int pilihSel = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline

                    if (pilihSel > 0 && pilihSel <= daftarSel.size()) {
                        Sel selDipilih = daftarSel.get(pilihSel - 1);
                        int menu1;
                        do {
                            System.out.println("===========================================================");
                            System.out.println("|                       Menu Tahanan                      |");
                            System.out.println("===========================================================");
                            System.out.printf("| %-55s |%n", "1. Tambah Tahanan", "");
                            System.out.printf("| %-55s |%n", "2. Hapus Tahanan", "");
                            System.out.printf("| %-55s |%n", "3. Informasi Tahanan", "");
                            System.out.printf("| %-55s |%n", "0. Kembali", "");
                            System.out.println("===========================================================");
                            System.out.print("| Pilih opsi: ");
                            menu1 = scanner.nextInt();
                            scanner.nextLine(); // Konsumsi newline
                            switch (menu1) {
                                case 1:
                                    System.out.println("===========================================================");
                                    System.out.println("|                      Tambah Tahanan                     |");
                                    System.out.println("-----------------------------------------------------------");
                                    Tahanan tahananBaru = Tahanan.tahananBaru(scanner);
                                    selDipilih.tambahTahanan(tahananBaru);
                                    break;
                                case 2:
                                    System.out.println("===========================================================");
                                    System.out.println("|                       Hapus Tahanan                     |");
                                    selDipilih.lihatTahanan();
                                    System.out.print("| Masukkan ID Tahanan: ");
                                    String idTahanan = scanner.nextLine();
                                    selDipilih.hapusTahanan(idTahanan);
                                    break;
                                case 3:
                                    selDipilih.lihatTahanan();
                                    break;
                                case 0:
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.println("|                  Kembali ke Menu Utama                  |");
                                    System.out.println("-----------------------------------------------------------");
                                    break;
                                default:
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.println("|           Opsi tidak valid. Silakan pilih lagi!         |");
                                    System.out.println("-----------------------------------------------------------");
                                    break;
                            }
                        } while (menu1 != 0);
                    } else {
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|                   Sel tidak ditemukan                   |");
                        System.out.println("-----------------------------------------------------------");
                    }
                    break;

                case 2:
                    // Menu Petugas
                    int menu2;
                    do {
                        System.out.println("===========================================================");
                        System.out.println("|                       Menu Petugas                      |");
                        System.out.println("===========================================================");
                        System.out.printf("| %-55s |%n", "1. Tambah Petugas", "");
                        System.out.printf("| %-55s |%n", "2. Hapus Petugas", "");
                        System.out.printf("| %-55s |%n", "3. Informasi Petugas", "");
                        System.out.printf("| %-55s |%n", "0. Kembali", "");
                        System.out.println("===========================================================");
                        System.out.print("Pilih opsi: ");
                        menu2 = scanner.nextInt();
                        scanner.nextLine(); // Konsumsi newline
                        switch (menu2) {
                            case 1:
                                System.out.println("===========================================================");
                                System.out.println("|                      Tambah Petugas                     |");
                                System.out.println("-----------------------------------------------------------");
                                Petugas.petugasBaru(scanner);
                                break;
                            case 2:
                                System.out.println("===========================================================");
                                System.out.println("|                      Hapus Petugas                      |");
                                System.out.println("-----------------------------------------------------------");
                                Petugas.lihatDaftarPetugas();
                                System.out.print("| Masukkan ID Petugas: ");
                                String idPetugas = scanner.nextLine();
                                Petugas.hapusPetugas(idPetugas);
                                break;
                            case 3:
                                Petugas.lihatDaftarPetugas();
                                break;
                            case 0:
                                System.out.println("-----------------------------------------------------------");
                                System.out.println("|                  Kembali ke Menu Utama                  |");
                                System.out.println("-----------------------------------------------------------");
                                break;
                            default:
                                System.out.println("-----------------------------------------------------------");
                                System.out.println("|           Opsi tidak valid. Silakan pilih lagi!         |");
                                System.out.println("-----------------------------------------------------------");
                                break;
                        }
                    } while (menu2 != 0);
                    break;

                case 3:
                    // Tambah Sel dengan Petugas yang berjaga
                    System.out.println("===========================================================");
                    System.out.println("|                       Tambah Sel                        |");
                    System.out.println("-----------------------------------------------------------");
                    System.out.print("| Masukkan Nomor Sel: ");
                    String nomorSel = scanner.nextLine();
                    System.out.print("| Masukkan Kapasitas Sel: ");
                    int kapasitasSel = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline

                    System.out.println("| Menambah Petugas Jaga untuk Sel...");
                    Petugas.lihatDaftarPetugas();
                    System.out.print("| Masukkan ID Petugas yang akan berjaga: ");
                    String idPetugasJaga = scanner.nextLine();
                    Petugas petugasJaga = null;
                    for (Petugas petugas : Petugas.getDaftarPetugas()) {
                        if (petugas.getIdPetugas().equals(idPetugasJaga)) {
                            petugasJaga = petugas;
                            break;
                        }
                    }

                    if (petugasJaga != null) {
                        Sel selBaru = new Sel(nomorSel, kapasitasSel);
                        selBaru.tambahPetugasJaga(petugasJaga);
                        daftarSel.add(selBaru);
                        System.out.println("-----------------------------------------------------------");
                        System.out.printf("| %-55s |%n",
                                "Sel " + nomorSel + " berhasil ditambahkan dengan kapasitas " + kapasitasSel, "");
                        System.out.println("-----------------------------------------------------------");
                    } else {
                        System.out.println("Petugas tidak ditemukan.");
                    }
                    break;

                case 4:
                    // Informasi Sipir
                    System.out.println("===========================================================");
                    System.out.println("|              Lihat Informasi Sipir             |");
                    System.out.println("-----------------------------------------------------------");
                    Sipir.lihatInfoSipir();
                    break;

                case 0:
                    // Keluar
                    stop = false;
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|          Terima kasih telah menggunakan sistem!         |");
                    System.out.println("-----------------------------------------------------------");
                    break;

                default:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|           Opsi tidak valid. Silakan pilih lagi!         |");
                    System.out.println("-----------------------------------------------------------");
                    break;
            }
        }
        scanner.close();
    }
}
