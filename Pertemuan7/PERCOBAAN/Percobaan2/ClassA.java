package Pertemuan7.PERCOBAAN.Percobaan2;

public class ClassA {
  private int x;
  private int y;

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }
  public int getX() {
    return x;
  }
  
  public int getY() {
    return y;
  }

  public void getNilai(){
    System.out.println("Nilai x : " + x);
    System.out.println("Nilai y : " + y);
  }
}
