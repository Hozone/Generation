import javax.swing.*;
class ControlloStringa2 
{
	public static void main(String[] args) 
	{

		int check=3;

		for (int j=0;j<3 ;j++ )
		{


			String nome=JOptionPane.showInputDialog("INSERISCI UNA STRINGA");
			if (!nome.equals("vito"))
			{
				check--;
				System.out.println("username errata ");
				System.out.println("hai ancora "+check+" tentativi");
				

			}
		}
		

		
	}
}
