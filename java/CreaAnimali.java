class CreaAnimali 
{
	public static void main(String[] args) 
	{

		Animali x=new Cane("mammifero");
		x.setVerso("bau");

		System.out.println("il verso del cane "+x.getVerso());
		System.out.println("tipo riproduzione "+x.getTipoRiproduzione());

		
	}
}
