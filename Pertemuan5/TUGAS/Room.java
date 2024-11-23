package Pertemuan5.TUGAS;

class Room {
  private int number;
  private String type;
  private double price;
  private boolean booked;

  public Room(int number, String type, double price) {
      this.number = number;
      this.type = type;
      this.price = price;
      this.booked = false;
  }

  public int getNumber() {
      return number;
  }

  public String getType() {
      return type;
  }

  public double getPrice() {
      return price;
  }

  public boolean isBooked() {
      return booked;
  }

  public void bookRoom() {
      this.booked = true;
  }

  public void releaseRoom() {
      this.booked = false;
  }
}
