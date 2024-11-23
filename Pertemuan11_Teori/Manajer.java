class Manajer extends Pegawai {
  private int tunjangan;

  public Manajer(String nama, int gaji, int tunjangan) {
      super(nama, gaji);
      this.tunjangan = tunjangan;
  }

  public int getGaji() {
      return gaji;
  }

  public int getTunjangan() {
      return tunjangan;
  }
}