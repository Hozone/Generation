class Bottiglia 
{

	private String materiale;

	private double capacita;
	private String colore;
	private String forma;

	//aggiungere i metodi di accesso alle propriet�

	public void assegnaMateriale(String m)
	{
		if(m.equals("vetro") || m.equals("plastica"))
		{
			
			materiale=m;
			System.out.println("assegnazione effettuata con successo");
		}
		else{
				System.out.println("materiale non valido");

		}

	}

}
