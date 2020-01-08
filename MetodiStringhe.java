
public class MetodiStringhe {

	public static void main(String[] args) {
		
		String pensiero="Ieri siamo andati al mare, il tempo era bello ma c'era troppo vento";
		
		int posizioneMare=pensiero.indexOf("mare");
		
		if (posizioneMare>=0)
			System.out.println("La frase contiene la parola mare in posizione "+posizioneMare);
		else
			System.out.println("La frase NON contiene la parola mare");
		
		if (pensiero.endsWith("vento"))
			System.out.println("La frase finisce con la parola vento");
		else
			System.out.println("La frase NON finisce con la parola vento");
		
		System.out.println(pensiero.substring(5, 12));
		
		System.out.println(pensiero.toUpperCase());
		
		System.out.println(pensiero.replaceAll("Ieri", "Oggi"));
	}

}
