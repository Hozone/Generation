class ContoCorrente 
{
		
		private double saldo;
		private String nome;
		private String cognome;


		public ContoCorrente()
		{
			
		}
		public ContoCorrente(double saldo)
		{
			this.saldo=saldo;
		}
		
		
		
		
		public ContoCorrente(double saldo,String nome,String cognome)
		{
			this.saldo=saldo;
			this.nome=nome;
			this.cognome=cognome;
		}




		public boolean deposito(double deposito){

			boolean esito=true;
			
			if (deposito >0)
			{
				this.saldo=this.saldo+deposito;
			}
			else
			{
					
					esito=false;
			}
				
			return esito;
		}

		public boolean prelievo(double prelievo){
			

				boolean esito=true;

				if (prelievo>this.saldo || prelievo <=0)
				{

					esito=false;
				}
				else
				{
					this.saldo=this.saldo-prelievo;
				}
				return esito;
		}


		public void setSaldo(double saldo){

			if (saldo <=0)
			{
				System.out.println("valore non valido");
			}
			else{
					this.saldo=saldo;
			}

		}





		public void setNome(String nome){

			this.nome=nome;
		}

		public void setCognome(String cognome){

			this.cognome=cognome;
		}
		
		public double getSaldo(){

			return this.saldo;
		}

		public String getNome(){
			
			return this.nome;

		}
		public String getCognome(){
			
			return this.cognome;

		}
		

}
