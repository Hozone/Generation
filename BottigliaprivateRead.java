class BottigliaprivateRead //categoria dell'oggetto
{

	private String materiale; // Per dare un valore a String deve essere all'interno di ""
	private double capacita; //Per dare un valore a double deve essere un numero decimale
	private String colore;
	private String forma;
	
	//Se vuoi evitare che si possa scrivere qualsiasi cosa nelle proprietÓ puoi aggiungere private
	//Bisogna aggiungere i "metodi" di accesso alle proprietÓ se si rendono privati
	
	public void setAssegnaMateriale(String m) //davanti ai metodi di scrittura si aggiunge "set"
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

	public void setAssegnaColore(String s)
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

	public String getLeggiMateriale() //davanti ai metodi di lettura si aggiunge "get" 
	//Per poter avere un ritorno di lettura della parola chiave inserita
	{
		return materiale;

	}





}