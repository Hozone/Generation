class ProvaIf2 
{
	public static void main(String[] args) 
	{

		//username: admin, gest, root ---> Stringhe
		//password 123  ---> numeri

		//username : guest, ospite, account ---> Stringhe
		//password: 456 ---> numeri

		String username="aaaa";

		int password=456;

		if (    username.equals("admin") || username.equals("gest") || username.equals("root")  )
		{
			if (password==123)
			{
				System.out.println("accesso effettuato");
			}
			else
			{
				System.out.println("password errata");
			}
		}
		else
		{
			if (username.equals("guest") || username.equals("ospite") || username.equals("account"))
			{

					if (password==456)
					{
						System.out.println("accesso effettuato");
					}
					else
					{
						System.out.println("password errata");
					}
			}
			else
			{
				System.out.println("username errata");
			}


		}


		
	}
}
