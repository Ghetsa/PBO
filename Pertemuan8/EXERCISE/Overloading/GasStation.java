package Pertemuan8.EXERCISE.Overloading;

class GasStation {
  private final int hargaPertamax = 10000;
  private final int hargaPertalite = 5000;

  public void isiBahanBakar(String jenisMobil, int bayar) {
      System.out.println("-----------------------------------------------");
      if (jenisMobil.equals("MobilKuno")) {
          int liter = bayar / hargaPertalite;
          System.out.println("| Mobil tua diisi pertalite sebanyak " + liter + " liter  |");
      } else if (jenisMobil.equals("MobilMewah")) {
          int liter = bayar / hargaPertamax;
          System.out.println("| Mobil mewah diisi pertamax sebanyak " + liter + " liter |");
      } else {
          System.out.println("| Jenis mobil tidak dikenal");
      }
      System.out.println("-----------------------------------------------");
  }
}