class TestAuto 
{
	public static void main(String[] args) 
	{
		String c="BMW";
		int a=1500;


		Auto x=new Auto();

		
		x.setMarca(c);
		
		x.setCilindrata(a);


		System.out.println("la marca dell'auto creata e :"+x.getMarca());

		System.out.println("la cilindrata dell'auto creata e :"+x.getCilindrata());
	}
}
