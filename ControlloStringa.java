import javax.swing.*;
class ControlloStringa 
{
	public static void main(String[] args) 
	{
		String nome=JOptionPane.showInputDialog("INSERISCI UNA STRINGA");

		if (nome.length()>=8 && nome.length()<15)
		{
			System.out.println("lunghezza giusta");
			System.out.println("numero di caratteri inseriti -->"+nome.length());


		}
		else
		{

			System.out.println("la stringa deve essere compresa tra 8 e 14 caratteri");
			System.out.println("numero di caratteri inseriti -->"+nome.length());
		
		}
		
	}
}
