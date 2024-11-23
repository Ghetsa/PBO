package Pertemuan5.TUGAS;

import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.println("|                  APLIKASI BOOKING HOTEL                 |");
        System.out.println("===========================================================");
        System.out.print("| Masukkan nama hotel: ");
        String hotelName = scanner.nextLine();
        System.out.print("| Masukkan alamat hotel: ");
        String hotelAddress = scanner.nextLine();
        System.out.println("-----------------------------------------------------------");

        Hotel hotel = new Hotel(hotelName, hotelAddress);

        System.out.print("| Masukkan jumlah kamar yang ingin ditambahkan: ");
        int roomCount = scanner.nextInt();
        System.out.println("-----------------------------------------------------------");

        // Loop untuk menambahkan kamar
        for (int i = 0; i < roomCount; i++) {
            System.out.println("| Masukkan informasi untuk kamar ke-" + (i + 1) + ":");
            System.out.print("| Nomor kamar: ");
            int roomNumber = scanner.nextInt();

            System.out.print("| Tipe kamar (Single/Double): ");
            String roomType = scanner.next();

            System.out.print("| Harga kamar: ");
            double roomPrice = scanner.nextDouble();

            Room room = new Room(roomNumber, roomType, roomPrice);
            hotel.addRoom(room);
            System.out.println("-----------------------------------------------------------");
        }

        // Menampilkan kamar yang tersedia
        System.out.println("| Daftar kamar yang tersedia di " + hotel.getName() + ":");
        for (Room room : hotel.getAvailableRooms()) {
            System.out.println(
                    "| Kamar No: " + room.getNumber() + ", Tipe: " + room.getType() + ", Harga: Rp" + room.getPrice());
        }

        // Meminta input data pelanggan untuk membuat pemesanan
        System.out.print("| Masukkan nama pelanggan: ");
        scanner.nextLine(); // Consume newline
        String customerName = scanner.nextLine();

        System.out.print("| Masukkan email pelanggan: ");
        String customerEmail = scanner.nextLine();

        Customer customer = new Customer(customerName, customerEmail);

        // Meminta input nomor kamar yang ingin dipesan
        System.out.print("| Masukkan nomor kamar yang ingin dipesan: ");
        int bookedRoomNumber = scanner.nextInt();

        // Mencari kamar berdasarkan nomor
        Room bookedRoom = null;
        for (Room room : hotel.getAvailableRooms()) {
            if (room.getNumber() == bookedRoomNumber) {
                bookedRoom = room;
                break;
            }
        }

        if (bookedRoom != null) {
            // Membuat pemesanan
            Booking booking = new Booking(1, customer, bookedRoom);

            // Menampilkan informasi pemesanan
            System.out.println("-----------------------------------------------------------");
            System.out.println("|                !!! PEMESANAN BERHASIL !!!               |");
            System.out.println("-----------------------------------------------------------");
            System.out.printf("| %-55s |%n", "Pemesanan ID: " + booking.getBookingId(), "");
            System.out.printf("| %-55s |%n", "Pelanggan: " + booking.getCustomer().getName(), "");
            System.out.printf("| %-55s |%n", "Kamar No: " + booking.getRoom().getNumber(), "");
            System.out.printf("| %-55s |%n", "Tipe Kamar: " + booking.getRoom().getType(), "");
            System.out.printf("| %-55s |%n", "Harga: Rp" + booking.getRoom().getPrice(), "");
            System.out.println("-----------------------------------------------------------");
            
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("|               !!! KAMAR TIDAK TERSEDIA !!!              |");
            System.out.println("-----------------------------------------------------------");
        }

        scanner.close();
    }
}