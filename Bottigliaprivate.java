class Bottigliaprivate //categoria dell'oggetto
{

	private String materiale; // Per dare un valore a String deve essere all'interno di ""
	private double capacita; //Per dare un valore a double deve essere un numero decimale
	private String colore;
	private String forma;
	
	//Se vuoi evitare che si possa scrivere qualsiasi cosa nelle proprietÓ puoi aggiungere private
	//Bisogna aggiungere i "metodi" di accesso alle proprietÓ se si rendono privati
	
	public void assegnaMateriale(String m)
	{
		if(m.equals("vetro") || m.equals("plastica"))
		{

			materiale=m;
			System.out.println("assegnazione del MATERIALE effettuata con successo");
		}
		else{
				System.out.println("MATERIALE non valido");
		
		}
	}

	public void assegnaColore(String s)
	{
		if(s.equals("verde") || s.equals("blu"))
		{

			colore=s;
			System.out.println("assegnazione del COLORE effettuata con successo");
		}
		else{
				System.out.println("COLORE non valido");
		
		}
	}
	}