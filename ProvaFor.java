import javax.swing.*;
class ProvaFor 
{
	public static void main(String[] args) 
	{
		String nome=JOptionPane.showInputDialog("INSERISCI UNA STRINGA");

		
		// CICLO FOR

		for ( int x=0  ; x<nome.length() ;  x++)
		{
			
				if (x==15)
				{
					System.out.println("Stringa troppo lunga");
					break;
				}

				
		}
		
	}
}
