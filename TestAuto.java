class TestAuto 
{
	public static void main(String[] args) 
	{
		Auto x=new Auto();
			String k="BMW";
			int g=1600;
			String f="rosso";
		x.setMarca(k);
		x.setCilindrata(g);
		x.setColore(f);
		
		System.out.println("La marca dell'auto creata e': "+x.getMarca());
		System.out.println("La cilindrata dell'auto creata e': "+x.getCilindrata());
		System.out.println("La marca dell'auto creata e': "+x.getColore());

	}
}
