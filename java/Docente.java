public class Docente{
	private String nome;
	private String cognome;
	private String materia;

	public Docente(String nome, String cognome, String materia){
		this.nome=nome;
		this.materia=materia;
		this.cognome=cognome;
	}

	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public String getMateria(){
		return materia;
	}

	public void setNome(String nome){
		this.nome=nome;
	}

	public void setCognome(String cognome){
		this.cognome=cognome;
	}

	public void setMateria(String materia){
		this.materia=materia;
	}

	public void stampaInfo(){
		System.out.println("Docente: ");
		System.out.println("Nome : "+ nome);
		System.out.println("Cognome : " + cognome);
		System.out.println("Materia : " + materia);
	}
}