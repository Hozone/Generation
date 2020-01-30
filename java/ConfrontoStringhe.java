
public class ConfrontoStringhe {

	public static void main(String[] args) {
		
		String unaStringa="Mi chiamo Lorenzo";
		String unAltraStringa="Mi chiamo Lorenzo";
		
		String primaParte="Mi chiamo";
		String secondaParte=" Lorenzo";
		
		// in realtà si tratta dello stesso oggetto, per questo hanno il medesimo contenuto
		if (unAltraStringa==unaStringa)
			System.out.println("Le stringhe sono uguali");
		else
			System.out.println("Le stringhe NON sono uguali");
		
		if (unaStringa==(primaParte+secondaParte))
			System.out.println("unaStringa e primaParte+secondaParte sono uguali");
		else
			System.out.println("unaStringa e primaParte+secondaParte NON sono uguali");
		
		if (unaStringa.equals(primaParte+secondaParte))
			System.out.println("unaStringa e primaParte+secondaParte hanno stesso contenuto");
		else
			System.out.println("unaStringa e primaParte+secondaParte NON hanno stesso contenuto");
		
		if (unaStringa==unaStringa.toUpperCase())
			System.out.println("Confronto con == VERO");
		else if (unaStringa.equals(unaStringa.toUpperCase()))
			System.out.println("Confronto con equals VERO");
		else if (unaStringa.equalsIgnoreCase(unaStringa.toUpperCase()))
			System.out.println("Confronto con equalsIgnoreCase VERO");
		else
			System.out.println("mai uguali");
		
		System.out.println("Le stringhe sono uguali");

	}

}
