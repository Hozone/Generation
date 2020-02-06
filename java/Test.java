public class Test{

	public static void main(String[] args) {
		Corso corso = new Corso("JAVA BASE");
		Docente matias = new Docente("Matias","Asis","Java");
		corso.setDocente(matias);
		Studente s1= new Studente("Vito", "Cammarata", 10);
		Studente s2= new Studente("Federico", "Tosto", 30);
		Studente s3= new Studente("Omero", "Vitali", 29);
		Studente s4= new Studente("Alex", "Innocenzi", 25);

		corso.aggiungiStudente(s1);
		corso.aggiungiStudente(s2);
		corso.aggiungiStudente(s3);
		corso.aggiungiStudente(s4);

		corso.stampaInfo();

		System.out.println("La media dei voti e' "+ corso.mediaStudenti());
	}
}
