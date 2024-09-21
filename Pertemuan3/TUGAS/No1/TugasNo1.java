package Pertemuan3.TUGAS.No1;



public class TugasNo1 {
  class Member { // buat menyimpan data member pelanggan rental videogame
    private int idMember;
    private String namaMember;

    // konstruktor
    public Member(int idMember, String namaMember) {
      this.idMember = idMember;
      this.namaMember = namaMember;
    }

    // getter nama member
    public String getNamaMember() {
      return this.namaMember;
    }
  }

  class Game { // buat menyimpan data videogame
    private String namaGame;
    private int hargaGame;

    // konstruktor
    public Game(String namaGame, int hargaGame) {
      this.namaGame = namaGame;
      this.hargaGame = hargaGame;
    }

    // getter nama game
    public String getNamaGame() {
      return this.namaGame;
    }

    // getter harga per hari
    public int getHargaGame() {
      return this.hargaGame;
    }
  }

  class Peminjaman {// buat menyimpan transaksi peminjaman & menghitung total harga pideoogames
    private int idPeminjaman;
    private Member member;
    private Game game;
    private int lamaSewa;
    private int totalHarga;

    // konstruk
    public Peminjaman(int idPeminjaman, Member member, Game game, int lamaSewa) {
      this.idPeminjaman = idPeminjaman;
      this.member = member;
      this.game = game;
      this.lamaSewa = lamaSewa;
    }

    public void hitungTotal() { // hitung total harga bdsrkan lama sewa & harga game
      this.totalHarga = this.lamaSewa * this.game.getHargaGame();
    }

    public void tampilData() {// print data peminjaman
      System.out.println("===============================================");
      System.out.println("|           Tampil Data Peminjaman            |");
      System.out.println("===============================================");
      System.out.printf("| %-43s |%n", "ID Peminjaman  : " + this.idPeminjaman, "");
      System.out.printf("| %-43s |%n", "Nama Member    : " + this.member.getNamaMember(), "");
      System.out.printf("| %-43s |%n", "Nama Game      : " + this.game.getNamaGame(), "");
      System.out.printf("| %-43s |%n", "Lama Sewa      : " + this.lamaSewa + " hari", "");
      System.out.printf("| %-43s |%n", "Harga per Hari : Rp " + this.game.getHargaGame(), "");
      System.out.printf("| %-43s |%n", "Total Harga    : Rp " + this.totalHarga, "");
      System.out.println("===============================================");
    }
  }
}

class Main {
  public static void main(String[] args) {
    // buat objek member
    TugasNo1.Member member1 = new TugasNo1().new Member(1, "Wawan bin Raiden");
    TugasNo1.Member member2 = new TugasNo1().new Member(2, "Lilisya Justice");

    // buat objek game
    TugasNo1.Game game1 = new TugasNo1().new Game("Genshin Impact", 25000);
    TugasNo1.Game game2 = new TugasNo1().new Game("The Last of Us", 15000);

    // buat objek peminjaman
    TugasNo1.Peminjaman peminjaman1 = new TugasNo1().new Peminjaman(101, member1, game1, 5);
    TugasNo1.Peminjaman peminjaman2 = new TugasNo1().new Peminjaman(102, member2, game2, 3);


    // hitung total harga
    peminjaman1.hitungTotal();
    peminjaman2.hitungTotal();

    // print data peminjaman
    peminjaman1.tampilData();
    peminjaman2.tampilData();
  }
}
