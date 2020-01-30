import javax.swing.*;
class ControlloStringa2 
{
	public static void main(String[] args) 
	{

		int check=3;

		for (int j=0;j<3 ;j++ )
		{


			String nome=JOptionPane.showInputDialog("INSERISCI UNA PASSWORD");
			
			if (!nome.equals("pippo"))
			{
				check=check-1;
				System.out.println("username errata ");
				System.out.println("hai ancora "+check+" tentativi");
				

			}
			else
			{
				System.out.println("OK");
				break;
			}
			
		}
		

		
	}
}
