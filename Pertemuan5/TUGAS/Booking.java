package Pertemuan5.TUGAS;

class Booking {
  private int bookingId;
  private Customer customer;
  private Room room;

  public Booking(int bookingId, Customer customer, Room room) {
      this.bookingId = bookingId;
      this.customer = customer;
      this.room = room;
      room.bookRoom(); // Mark the room as booked when the booking is created
  }

  public int getBookingId() {
      return bookingId;
  }

  public Customer getCustomer() {
      return customer;
  }

  public Room getRoom() {
      return room;
  }

  public void cancelBooking() {
      room.releaseRoom(); // Release the room when the booking is canceled
  }
}