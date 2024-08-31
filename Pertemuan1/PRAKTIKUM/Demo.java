package PRAKTIKUM;

public class Demo {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Smartphone sp1 = new Smartphone();
        MotorBensin mb1 = new MotorBensin();
        MotorListrik ml1 = new MotorListrik();


        laptop1.setMerk("Lenovo");
        laptop1.nyalakan();
        laptop1.setUkuranLayar(15);
        laptop1.setKecerahanLayar(50);
        laptop1.setKapasitasBaterai(4000);
        laptop1.setPersenBaterai(40);
        laptop1.tambahKecerahan(5);
        laptop1.isiDaya(20);
        laptop1.cetakStatus();


        sp1.setMerk("Oppo");
        sp1.setUkuranLayar(6.5);
        sp1.setKecerahanLayar(40);
        sp1.setKapasitasBaterai(6000);
        sp1.setPersenBaterai(90);
        sp1.cetakStatus();
        sp1.nyalakan();
        sp1.tambahKecerahan(5);
        sp1.isiDaya(2);
        sp1.cetakStatus();

        mb1.setModel("Vario");
        mb1.setKapasitasBensin(8);
        mb1.setPersenBensin(50);
        mb1.cetakStatus();
        mb1.nyalakan();
        mb1.isiBensin(1);
        mb1.cetakStatus();
        mb1.gas(20);
        mb1.cetakStatus();

        ml1.setModel("Gesit");
        ml1.setKapasitasBaterai(50000);
        ml1.setPersenBaterai(50);
        ml1.cetakStatus();
        ml1.nyalakan();
        ml1.isiDaya(1000);
        ml1.cetakStatus();
        ml1.gas(20);
        ml1.cetakStatus();

    }

}
