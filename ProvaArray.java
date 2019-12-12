class ProvaArray 
{
	public static void main(String[] args) 
	{
		//CREAZIONE DI UNA ARRAY DI STRINGHE

		String[] nomi= new String[5];

		nomi[0]="Vito";
		nomi[1]="francesco";
		nomi[2]="mario";
		nomi[3]="emanuela";
		nomi[4]="simone";

		System.out.println("LA LUNGHEZZA DELL'ARRAY NOMI --> "+nomi.length);
		System.out.println(nomi[3]);

		//STAMPA DI TUTTO L'ARRAY nomi

		for (int i=0;i<nomi.length ; i++)
		{
			System.out.println(nomi[i]);
		}


	}
}
