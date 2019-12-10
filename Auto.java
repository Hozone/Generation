class  Auto
{
	//***************************
	//sezione delle proprietà
	private String marca;
	private int cilindrata;
	private String colore;
	private String tipoCarburante;
	//fine dichiarazione proprietà
	//***************************


	//***********************
	// inizio dichiarazione dei getter e setter

	public String getMarca()
	{

		return marca;

	}

	public void setMarca(String k)
	{
		marca=k;
	}
	
	public int getCilindrata()
	{

		return cilindrata;

	}
	public void setCilindrata(int k)
	{
			cilindrata=k;

	}

	public void setColore(String c)
	{

		colore=c;

	}
	
	
	public String getColore()
	{

		return colore;
	}

	public String getTipoCarburante()
	{
		return tipoCarburante;


	}

	public void setTipoCarburante(String f)
	{

			tipoCarburante=f;
	}
}
