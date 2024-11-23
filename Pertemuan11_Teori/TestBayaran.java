
public class TestBayaran {
public static void main(String[] args)
{
Manajer man = new Manajer("Agus", 800, 50);
Programmer prog = new Programmer("Budi", 600, 30); 
Bayaran hr = new Bayaran();

System.out.println("-----------------------------");
System.out.println("| Bayaran manajer    : "+ hr.hitungBayaran (man)+ "  |"); 
System.out.println("| Bayaran programmer : "+ hr.hitungBayaran (prog)+ "  |");
System.out.println("-----------------------------");

}
}