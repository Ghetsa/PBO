package Pertemuan7.PERCOBAAN.Percobaan2;

public class ClassB extends ClassA{
  private int z;

  public void setZ(int z){
    this.z = z;
  }
  public int getZ() {
    return z;
  }

  public void getNilaiZ(){
    System.out.println("Nilai z : " + z);
  }

  public void getJumlah(int nilaiZ){
    System.out.println("Jumlah  : " + (getX() + getY() + z));
  }
}
