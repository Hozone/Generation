//QUESTO TEST CONTIENE LA CASELLA DI INSERIMENTO TESTO DOPO IL run.
import javax.swing.*;
class CreaBottiglieprivateRead
{
	public static void main(String[] args) 
	{
		Bottigliaprivate z=new Bottigliaprivate();
		String a="vetro";
		String s="verde";

		z.setAssegnaMateriale(a);
		z.setAssegnaColore(s);

/*se il valore corrisponde ad un attributo corretto quando verr� eseguito il run comparir� un messaggio di successo
se il valore NON corrisponde ad attributo corretto comparir� un messaggio che non sar� valido*/

		System.out.println("il materiale attuale e': "+z.getLeggiMateriale()); //dar� il messaggio che il colore scelto � il verde

	}
}