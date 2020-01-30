class Manager extends Impiegato 
{
	
	private double bonusStipendio;

	public Manager(String x,String v,double t,double bonus){
		
		super(x,v,t);
		this.bonusStipendio=bonus;

		
		

	}

	//OVERRIDING
	@Override   //ANNOTATION
	public double getStipendio(){

		double stip=super.getStipendio();
		return stip*bonusStipendio;
		
	}



}
