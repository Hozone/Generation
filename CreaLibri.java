public class CreaLibri {

	public static void main(String[] args) {
		
		
		Libro x=new Libro();
		x.setAutore("Manzoni");
		x.setNumeroPagine(500);
		x.setTitolo("Promessi Sposi");
		x.setPrezzo(30);
		
		Libro x2=new Libro();
		x2.setAutore("Follet");
		x2.setNumeroPagine(500);
		x2.setTitolo("I pilastri della terra");
		x2.setPrezzo(35);
		
		Libro x3=new Libro();
		x3.setAutore("Asimov");
		x3.setNumeroPagine(500);
		x3.setTitolo("I robot");
		x3.setPrezzo(40);
		
		Libro[] libri=new Libro[3];
		libri[0]=x;
		libri[1]=x2;
		libri[2]=x3;
		
		//GESTIONE ARCHIVIO
		
		for(int i=0;i<libri.length;i++) {
			
				System.out.println("TITOLO A INDICE "+i+" -->"+libri[i].getTitolo());
				
				System.out.println("AUTORE A INDICE "+i+" -->"+libri[i].getAutore());
				System.out.println("#############################################");
		}

	}

}
