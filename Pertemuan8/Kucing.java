package Pertemuan8;

public class Kucing {
  public Kucing(){
    System.out.println("Ini konstruk pertama");
  }

  public Kucing(String jenis){
    System.out.println("Ini konstruk Kedua");
  }

  public static void main(String[] args) {
    Kucing kampung = new Kucing();
    Kucing persia = new Kucing("Persia");
  }
}
