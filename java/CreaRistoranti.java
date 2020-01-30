class CreaRistoranti 
{
	public static void main(String[] args) 
	{

		String[] menu={"carbonara","matriciana","bistecca","orata"};
		
		Ristorante x=new Ristorante("da Felicetto","testaccio",50,menu,"romanesca");

		System.out.println("****** il menu di :"+x.getNome()+" ********");
		System.out.println("************************************");
		for(String m: x.getMenu()){

			
			System.out.println(m);
		}
		
	}
}
