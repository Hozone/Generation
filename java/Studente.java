public class Studente{
	private String nome;
	private String cognome;
	private float mediaVoti;

	public Studente(String nome, String cognome, float mediaVoti){
		this.nome=nome;
		this.mediaVoti=mediaVoti;
		this.cognome=cognome;
	}
	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public float getMediaVoti(){
		return mediaVoti;
	}

	public void setNome(String nome){
		this.nome=nome;
	}

	public void setCognome(String cognome){
		this.cognome=cognome;
	}

	public void setMediaVoti(float mediaVoti){
		this.mediaVoti=mediaVoti;
	}

	public void stampaInfo(){
		System.out.println("Studente: ");
		System.out.println("Nome : "+ nome);
		System.out.println("Cognome : " + cognome);
		System.out.println("Media dei voti : " + mediaVoti);
	}
}