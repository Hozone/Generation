public class Corso{
	private String nome;
	private Docente docente;
	private Studente[] studenti = new Studente[20];

	public Corso(String nome){
		this.nome=nome;
	}

	public String getNome(){
		return nome;
	}
	public Docente getDocente(){
		return docente;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setDocente(Docente docente){
		this.docente=docente;
	}

	public void aggiungiStudente(Studente studente){
		for (int i=0;i<studenti.length;i++) {
			if(studenti[i]==null){
				studenti[i]=studente;
				break;
			}
		}
	}

	public void rimuoviStudente(int indice){
		studenti[indice]=null;
	}

	public void stampaInfo(){
		System.out.println("Corso: ");
		System.out.println("Nome : "+ nome);
		docente.stampaInfo();
		for (int i=0;i<studenti.length;i++) {
			if(studenti[i]!=null){
				studenti[i].stampaInfo();
			}else break;
		}
	}

	public float mediaStudenti(){
		float media = 0.0f;
		float appoggio=0.0f;
		for (int i=0;i<studenti.length;i++) {
			if(studenti[i]!=null){
				appoggio+=studenti[i].getMediaVoti();
			}else{
				media=appoggio/(i+1);
				break;
			}
		}
		return media;
	}
}