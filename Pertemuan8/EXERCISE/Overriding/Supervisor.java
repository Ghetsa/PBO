package Pertemuan8.EXERCISE.Overriding;

public class Supervisor extends Manajer {

  public Supervisor(String nama, int gaji) {
      super(nama, gaji);
  }

  @Override
  public void naikkanGaji() {
      gaji += 1500000;
  }
}
