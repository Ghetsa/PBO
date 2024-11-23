package Pertemuan8.EXERCISE.Overloading;


public class TestGasStation {
    public static void main(String[] args) {
        GasStation gs = new GasStation();
        String jenisMobilKuno = "MobilKuno";
        String jenisMobilMewah = "MobilMewah";
        gs.isiBahanBakar(jenisMobilKuno, 20000);
        gs.isiBahanBakar(jenisMobilMewah, 20000);
    }
}
