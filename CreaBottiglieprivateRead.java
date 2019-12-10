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

/*se il valore corrisponde ad un attributo corretto quando verrà eseguito il run comparirà un messaggio di successo
se il valore NON corrisponde ad attributo corretto comparirà un messaggio che non sarà valido*/

		System.out.println("il materiale attuale e': "+z.getLeggiMateriale()); //darà il messaggio che il colore scelto è il verde

	}
}