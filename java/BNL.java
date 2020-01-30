class BNL 
{
	public static void main(String[] args) 
	{

		ContoCorrente x=new ContoCorrente();

		x.setNome("Franco");
		x.setCognome("Giorgi");
		x.deposito(2000);

		if (  x.prelievo(1000)    )
		{

				System.out.println("prelievo effettuato con successo");
		}
		else
		{
				System.out.println("cifra non disponibile");
		}



		//System.out.println("Hello World!");
	}
}
