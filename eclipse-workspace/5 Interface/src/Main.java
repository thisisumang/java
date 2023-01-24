import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

interface GamePrize{
	
//	In old times used as class containing constants
	public final String FIRSTPRIZE = "Gold";
	public final String SECONDPRIZE = "Bronze";
	public final String THIRDPRIZE = "Silver";
	
}
public class Main implements GamePrize{
	
	public static void main(String[] args){
		System.out.println(FIRSTPRIZE);
		System.out.println(THIRDPRIZE);
		System.out.println(SECONDPRIZE);
		
		Teacher t1 = new TGT();
		Teacher t2 = new PGT();
		
		t1.qualification();
		t2.qualification();
	}
}
