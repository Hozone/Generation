class CreaBottiglie 
{
	public static void main(String[] args) 
	{
		Bottiglia x=new Bottiglia();//assegnazione di un riferimento
									//della classe Bottiglia alla
									//variabile x
		Bottiglia y=new Bottiglia();
		Bottiglia z=new Bottiglia();

		z.materiale="metallo"; //aggiungendo la variabile ed il valore all'interno del programma sostituirą quella assegnata genericamente dalla classe
		z.capacita=1.0;
		z.colore="blu";
		z.forma="conica";
		y.materiale="plastica";
		y.capacita=1.5;
		y.colore="viola";
		y.forma="quadrata";
		
		System.out.println("la proprieta materiale di x vale : "+x.materiale);//+ seguito da una variabile n seguito da . seguito dal valore assegnato permette la lettura delle proprieta della classe x create in precendenza
		System.out.println("la proprieta materiale di y vale : "+y.materiale);
		System.out.println("la proprieta materiale di z vale : "+z.materiale);
		System.out.println("la proprieta capacita' di x vale : "+x.capacita);
		System.out.println("la proprieta capacita' di y vale : "+y.capacita);
		System.out.println("la proprieta capacita' di z vale : "+z.capacita);
		System.out.println("la proprieta colore di x vale : "+x.colore);
		System.out.println("la proprieta colore di y vale : "+y.colore);
		System.out.println("la proprieta colore di z vale : "+z.colore);
		System.out.println("la proprieta forma di x vale : "+x.forma);
		System.out.println("la proprieta forma di y vale : "+y.forma);
		System.out.println("la proprieta forma di z vale : "+z.forma);
	}
}
