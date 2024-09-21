package Pertemuan4.TUGAS.No4;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if ((jumlahPinjaman + jumlah) > limitPinjaman) {
            System.out.printf("| %-55s |%n", "Maaf, jumlah pinjaman melebihi limit.", "");

        } else {
            jumlahPinjaman += jumlah;
            System.out.printf("| %-55s |%n", "Jumlah pinjaman saat ini: " + jumlahPinjaman, "");
        }
        System.out.println("-----------------------------------------------------------");

    }

    // public void angsur(int jumlah) {
    //     jumlahPinjaman -= jumlah;
    //     if (jumlahPinjaman < 0) {
    //         jumlahPinjaman = 0;
    //     }
    //     System.out.printf("| %-55s |%n", "Jumlah pinjaman saat ini: " + jumlahPinjaman, "");
    //     System.out.println("-----------------------------------------------------------");

    // }

    public void angsur(int jumlah) {
        if (jumlah >= 0.1 * jumlahPinjaman) {
            jumlahPinjaman -= jumlah;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
            System.out.printf("| %-55s |%n", "Jumlah pinjaman saat ini: " +
                    jumlahPinjaman, "");
        } else {
            System.out.printf("| %-55s |%n", "Maaf, angsuran harus minimal 10% dari jumlah pinjaman.", "");
        }
        System.out.println("-----------------------------------------------------------");

    }
}
