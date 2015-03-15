import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		List aL = new ArrayList();
		aL.add("Zara");
		aL.add("Moshe");
		aL.add("Rick");
		System.out.println("ArrayList Elements");
		System.out.print("\t" +aL);
		
		List lL = new LinkedList();
		lL.add("FC Barcelona");
		lL.add("Borussia Dortmund");
		lL.add("Manchester United");
		System.out.println();
		System.out.println(" LinkedList Elements");
		System.out.print("\t" + lL);

		Set hS = new HashSet();
		hS.add("Cibao FC");
		hS.add("Puerto Plata Atlántico FC");
		hS.add("Bauger FC");
		hS.add("Vega Real");
		hS.add("Atlético Pantoja");
		System.out.println();
		System.out.println(" Set Elements");
		System.out.print("\t" + hS);
		
		Map hM = new HashMap();
		hM.put("Rick Grimes", "Leader/Guns");
		hM.put("Daryl Dixon", "Survivalist Specialist/Long Range Bow");
		hM.put("Glenn", "Discover/Rogue/Explorer");

		System.out.println();
		System.out.println(" Map Elements");
		System.out.print("\t" + hM);

	}
}