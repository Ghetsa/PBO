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

class DaftarGaji {
    private Pegawai[] listPegawai;

    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }

    public void addPegawai(Pegawai p) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = p;
                break;
            }
        }
    }

    public void printSemuaGaji() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                       DATA PEGAWAI                      |");
        System.out.println("-----------------------------------------------------------");
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null) {
                System.out.printf("| %-55s |%n", "NIP  : " + pegawai.getNIP());
                System.out.printf("| %-55s |%n", "Nama : " + pegawai.getNama());
                System.out.printf("| %-55s |%n", "Gaji : Rp " + pegawai.getGaji());
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        DaftarGaji daftarGaji = new DaftarGaji(10);

        Dosen dosen1 = new Dosen("123", "Dr. Andika Galih,S.T.,M.Kom.", "Malang");
        dosen1.setSKS(12);

        Pegawai pegawai1 = new Pegawai("456", "Budiono Siregar,S.Teh", "Medan");

        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(pegawai1);

        do {
            System.out.println("===========================================================");
            System.out.println("|                   APLIKASI GAJI DOSEN                   |");
            System.out.println("===========================================================");
            System.out.printf("| %-55s |%n", "Menu:");
            System.out.printf("| %-55s |%n", "1. Tambah Dosen");
            System.out.printf("| %-55s |%n", "2. Tambah Pegawai");
            System.out.printf("| %-55s |%n", "3. Tampilkan Data Pegawai");
            System.out.printf("| %-55s |%n", "0. Keluar");
            System.out.println("-----------------------------------------------------------");

            System.out.print("| Pilih (1/2/3/0): ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("===========================================================");
                    System.out.println("|                     Tambah Data Dosen                   |");
                    System.out.println("===========================================================");
                    System.out.print("| NIP             : ");
                    String newNIP = scanner.nextLine();
                    System.out.print("| Nama dosen      : ");
                    String newDosen = scanner.nextLine();
                    System.out.print("| Alamat          : ");
                    String newAlamat = scanner.nextLine();
                    System.out.print("| SKS yang diampu : ");
                    int newSKS = scanner.nextInt();

                    Dosen dosenBaru = new Dosen(newNIP, newDosen, newAlamat);
                    dosenBaru.setSKS(newSKS);
                    daftarGaji.addPegawai(dosenBaru);

                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|             Data Dosen Berhasil di Tambahkan            |");
                    System.out.println("-----------------------------------------------------------");
                    break;

                case 2:
                    System.out.println("===========================================================");
                    System.out.println("|                    Tambah Data Pegawai                  |");
                    System.out.println("===========================================================");
                    System.out.print("| NIP             : ");
                    String newNIPP = scanner.nextLine();
                    System.out.print("| Nama pegawai    : ");
                    String newPegawai = scanner.nextLine();
                    System.out.print("| Alamat          : ");
                    String newAlamatP = scanner.nextLine();

                    Pegawai pegawaiBaru = new Pegawai(newNIPP, newPegawai, newAlamatP);
                    daftarGaji.addPegawai(pegawaiBaru);

                    System.out.println("-----------------------------------------------------------");
                    System.out.println("|            Data Pegawai Berhasil di Tambahkan          |");
                    System.out.println("-----------------------------------------------------------");
                    break;

                case 3:
                    daftarGaji.printSemuaGaji();
                    break;

                case 0:
                    System.out.println("===========================================================");
                    System.out.println("|             !!     Keluar dari program     !!           |");
                    System.out.println("===========================================================");
                    break;

                default:
                    System.out.println("===========================================================");
                    System.out.println("|             !!     Pilihan tidak valid     !!           |");
                    System.out.println("===========================================================");
                    break;
            }

        } while (menu != 0);

        scanner.close();
    }
}
