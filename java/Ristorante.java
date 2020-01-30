class Ristorante {
	
	
	private String nome;
	private String indirizzo;
	private int numeroCoperti;
	private String[] menu;
	private String tipoCucina;
	
	
	
	public Ristorante(String nome, String indirizzo) {
		
		this.nome = nome;
		this.indirizzo = indirizzo;
		
	}
	
	
	
	public Ristorante(String nome, String indirizzo, int numeroCoperti, String[] menu, String tipoCucina) {
		
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.numeroCoperti = numeroCoperti;
		this.menu = menu;
		this.tipoCucina = tipoCucina;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public int getNumeroCoperti() {
		return numeroCoperti;
	}
	public void setNumeroCoperti(int numeroCoperti) {
		this.numeroCoperti = numeroCoperti;
	}
	public String[] getMenu() {
		return menu;
	}
	public void setMenu(String[] menu) {
		this.menu = menu;
	}
	public String getTipoCucina() {
		return tipoCucina;
	}
	public void setTipoCucina(String tipoCucina) {
		this.tipoCucina = tipoCucina;
	}
	
	
	

}
