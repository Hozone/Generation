class CreaImpiegati 
{
	public static void main(String[] args) 
	{ 
		
		Impiegato x = new Impiegato("Francesco","Rossi",2400);
		Manager y=new Manager("Mario","Rossi",2400,2);

		System.out.println("stipendio del nuovo manager :"+y.getStipendio());

		System.out.println("stipendio del nuovo assunto :"+x.getStipendio()+" Euro");
		
		/*
		System.out.println("nome del nuovo assunto :"+x.getNome());
		System.out.println("cognome del nuovo assunto :"+x.getCognome());
		System.out.println("stipendio del nuovo assunto :"+x.getStipendio()+" Euro");
		*/
	
	}
}
