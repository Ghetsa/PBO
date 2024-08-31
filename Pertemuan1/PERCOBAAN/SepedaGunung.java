public class SepedaGunung extends Sepeda{
  private String tipeSuspensi;
  
  public void setTipeSuspensi(String newValue){
      tipeSuspensi = newValue;
  }

  public void cetakStatus(){
    super.cetakStatus();
    System.out.println("tipe suspensi: " + tipeSuspensi);
  }
}
