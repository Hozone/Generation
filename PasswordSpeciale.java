import java.util.Scanner;
public class PasswordSpeciale{
	public static void main(String[] args) {
		
		boolean passCorretta = false;
		int num = 0,chSpeciale = 0,maiusc = 0;
		int y = 10;
		do{
			num = 0;
			chSpeciale = 0;
			maiusc = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("La password deve contenere:\n"
				+"1)lunghezza superiore a 8 caratteri\n"
				+"2)almeno due numeri\n"
				+"3)almeno un carattere speciale(non lo spazio)\n"
				+"4)almeno un carattere maiuscolo\n"
				+"inserisci password");
			String pass = sc.next().trim();
			if(pass.length()<8 || pass.contains(" ")){
				passCorretta = false;
			}else{
				for(int i = 0; i < pass.length(); i ++){
					char ch = pass.charAt(i);
					if(!(ch >= 'a' && ch<='z')){
						if(ch >= '0' && ch <='9') num ++;
						else if(ch >= 'A' && ch <= 'Z') maiusc++;
						else chSpeciale ++;
					}
				}

			}
			if(num >=2 && chSpeciale>0 && maiusc > 0 )passCorretta = true;
			else passCorretta = false;


		}while(passCorretta==false);






		/*
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("La password deve contenere:\n"
				+"1)lunghezza superiore a 8 caratteri\n"
				+"2)almeno due numeri\n"
				+"3)almeno un carattere speciale(non lo spazio)\n"
				+"4)almeno un carattere maiuscolo\n"
				+"inserisci password");
			String pass = sc.next().trim();
			if(pass.length()<8 || pass.contains(" ")){
				passCorretta = false;
			}else{
				for(int i = 0; i < pass.length(); i ++){
					char ch = pass.charAt(i);
					if(!((ch >= 'a' && ch<='z') || (ch >= 'A' && ch<='Z'))){
						if(ch >= '0' && ch <='9') num ++;
						else chSpeciale++;
					}else if(ch >= 'A' && ch <= 'Z'){
						maiusc ++;
					}
				}
			}
			if(num >=2 && chSpeciale>0 && maiusc > 0 )passCorretta = true;
			else passCorretta = false;


		}while(!passCorretta);
		System.out.println("benvenuto!");
		*/
		
		
	}
}