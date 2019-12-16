class Cassa 
{
	
		public double scontrino(OggettoPrezzabile[] o){

			double totaleScontrino=0;

			for (int i=0;i<o.length ; i++)
			{


				totaleScontrino=totaleScontrino + o[i].getPrezzo();
			}

			return totaleScontrino;
		}


}
