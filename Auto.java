class Auto
{
	//*******************************************
	//sezione delle propriet� o attributi
	private String marca;
	private int cilindrata;
	private String colore;
	private String tipoCarburante; 
	//Convenzionzione CamelCase ovvero se � una frase composta la prima parola si inizia con una lettera minuscola e per la seconda parola maiuscola
	
	//*******************************************
	//inizio dichiarazione dei getter (ritorno) e setter (scrittura)
	//ps. ricordare che i metodi iniziano SEMPRE con 

	public String getMarca()
	{
		return marca; //in fase di lettura il "return" deve essere l'ultima istruzione
	}

	public void setMarca(String k)
	{
		marca=k; 
	}

	public int getCilindrata()
	{
		return cilindrata;
	}

	public void setCilindrata(int g)
	{
		cilindrata=g;
	}

	public String getColore()
	{
		return colore;
	}

	public void setColore(String f)
	{
		colore=f;
	}

	public String getTipoCarburante()
	{
		return tipoCarburante;
	}

	public void setTipoCarburante(String h)
	{
		tipoCarburante=h;
	}



}
