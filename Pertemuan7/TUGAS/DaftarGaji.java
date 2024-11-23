package Pertemuan7.TUGAS;
import java.util.Scanner;



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