class  Impiegato
{

		private String nome;       //campi istanza della classe
		private String cognome;
		private double stipendio;


		
		public Impiegato(String nome,String cognome,double stipendio){

			this.nome=nome;
			this.cognome=cognome;
			this.stipendio=stipendio;


		}

		

		public void setNome(String nome){
			
				this.nome=nome;//USO DEL THIS: PARAMETRO IMPLICITO ( OGGETTO CORRENTE )

		}
		public void setCognome(String cognome){
			
				this.cognome=cognome;//USO DEL THIS: PARAMETRO IMPLICITO ( OGGETTO CORRENTE )

		}
		public void setStipendio(double stipendio){
			
				this.stipendio=stipendio;//USO DEL THIS: PARAMETRO IMPLICITO ( OGGETTO CORRENTE )

		}
		
		public String getNome(){
			
				return this.nome;
		}
		public String getCognome(){
			
				return this.cognome;
		}
		
		public double getStipendio(){
			
				return this.stipendio;
		}
	
}
