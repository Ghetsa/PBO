package Pertemuan3.TUGAS.No4;

public class TugasNo4 {
    public class Barang {
        String kode;
        String namaBarang;
        int hargaDasar;
        float diskon;

        // konstruk
        public Barang(String kode, String namaBarang, int hargaDasar, float diskon) {
            this.kode = kode;
            this.namaBarang = namaBarang;
            this.hargaDasar = hargaDasar;
            this.diskon = diskon;
        }

        // menghitung harga jual
        public int hitungHargaJual() {
            return (int) (hargaDasar - (diskon / 100 * hargaDasar));
        }

        // menampilkan data barang
        public void tampilData() {
            System.out.println("===============================================");
            System.out.println("|             Tampil Data Barang              |");
            System.out.println("===============================================");
            System.out.printf("| %-43s |%n", "Kode Barang     : " + this.kode, "");
            System.out.printf("| %-43s |%n", "Nama Barang     : " + this.namaBarang, "");
            System.out.printf("| %-43s |%n", "Harga Dasar     : Rp " + this.hargaDasar, "");
            System.out.printf("| %-43s |%n", "Diskon          : " + this.diskon + "%", "");
            System.out.printf("| %-43s |%n", "Harga Jual      : Rp " + hitungHargaJual(), "");
            System.out.println("===============================================");
        }

    }

}
