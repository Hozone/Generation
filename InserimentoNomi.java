import javax.swing.*;
class InserimentoNomi 
{
	public static void main(String[] args) 
	{
		String[] valori=new String[5];

		for (int a=0;a<valori.length ;a++ )
		{

			valori[a]=JOptionPane.showInputDialog("INSERISCI NOME");
			System.out.println("nome inserito --> "+valori[a]);
		}
		
		
		
	}
}
