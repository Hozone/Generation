class Libro2 extends MassMedia implements OggettoPrezzabile
{
	private double prezzo;


	@Override
	public  void setPrezzo(double prezzo){

			this.prezzo=prezzo;
	}



	@Override
	public double getPrezzo(){
	
		return this.prezzo;
	}

}
