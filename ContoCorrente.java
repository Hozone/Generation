class ContoCorrente 
{
		
		private double saldo;
		private String nome;
		private String cognome;



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

				if (prelievo>this.saldo)
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
