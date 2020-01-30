class Supermercato 
{
	public static void main(String[] args) 
	{
		Cassa c=new Cassa();
		
		OggettoPrezzabile v=new Libro2();
		v.setPrezzo(20);

		OggettoPrezzabile v2=new Libro2();
		v2.setPrezzo(50);

		OggettoPrezzabile v3=new Libro2();
		v3.setPrezzo(60);

		OggettoPrezzabile v4=new Pasta();
		v4.setPrezzo(1.5);

		OggettoPrezzabile[] prodotti=new OggettoPrezzabile[4];

		prodotti[0]=v;
		prodotti[1]=v2;
		prodotti[2]=v3;
		prodotti[3]=v4;

		System.out.println("totale scontrino :"+c.scontrino(prodotti));

	}
}
