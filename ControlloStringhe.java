class ControlloStringhe 
{
	//username admin gest root
	//password 123
	//username guest ospite account
	//password 456

	boolean controlloLunghezza(String username)
	{ 
		if (username.length()>=4 && username.length()<=8)
		{
			return true;
		}
		else
		{
          return false;

		}
	}


	void controllo(String username,int password)
	{
			if (username.equals("admin") || username.equals("gest") || username.equals("root") || username.equals("guest")  || 
				username.equals("ospite") || username.equals("account")) 
			{
					if (username.equals("admin") || username.equals("gest") || username.equals("root"))
					{
						if (password==123)
						{
							System.out.println("accesso effettuato");
						}
						else
						{ 
						}
					if (username.equals("guest")  || 
							username.equals("ospite") || username.equals("account")) 
					{
						if(password==456) {

							
							System.out.println("accesso effettuato");
						} 
						else {
							System.out.println("pass sbagliata");
						}
					}

			} 

		}	
	}


	

}
