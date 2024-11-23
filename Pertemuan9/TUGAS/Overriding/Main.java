package Pertemuan9.TUGAS.Overriding;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Manusia, Dosen, dan Mahasiswa
        Manusia m = new Manusia();
        Dosen d = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        // Memanggil metode bernafas dan makan pada objek Manusia
        System.out.println("--------------------------------------------------");
        System.out.println("| Manusia:                                       |");
        m.bernafas();
        m.makan();
        System.out.println("--------------------------------------------------");


        // Memanggil metode bernafas, makan, dan lembur pada objek Dosen
        System.out.println("--------------------------------------------------");
        System.out.println("| Dosen:                                         |");
        d.bernafas();
        d.makan();
        d.lembur();
        System.out.println("--------------------------------------------------");

        // Memanggil metode bernafas, makan, dan tidur pada objek Mahasiswa
        System.out.println("-------------------------------------------------");
        System.out.println("| Mahasiswa:                                     |");
        mhs.bernafas();
        mhs.makan();
        mhs.tidur();
        System.out.println("--------------------------------------------------");

    }
}
