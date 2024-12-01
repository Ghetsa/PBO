package Pertemuan10.PERCOBAAN;

public class Tester4 {
  public static void main(String[] args) {
      Owner ow = new Owner();
      ElectricityBill eBill = new ElectricityBill(5, "R-1");
      PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
      InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);

      ow.pay(eBill);
      ow.pay(pEmp);

      ow.showMyEmployee(pEmp);
      ow.showMyEmployee(iEmp);

      // ow.pay(iEmp);
  }
}
