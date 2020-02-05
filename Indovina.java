import java.util.Scanner;
public class Indovina{
	public static void main(String[] args) {
		char c = 'a';
		char c1 = 'z';
		int i = c;
		int i1=c1;
		char c2 = '9';
		int i2 = c2;
		System.out.println(i+" "+i1);
		System.out.println("valore numerico del char 9"+i2);
/*
		if(c >= 'a' && c <='z'){
			System.out.println(c+" sta tra a e z");
		}else{
			System.out.println("non sta tra a e z");
		}*/
		/*
		do{
			
			int generato = Test1.generand();
			int numero=0;
			Scanner input = new Scanner(System.in);

			int tentativi=5;
			System.out.println(generato);
			for (tentativi=5;tentativi>0 ;tentativi-- ) {
				System.out.println("Hai a disposizione "+ tentativi + " Tentativi");
				do{
					System.out.println("Inserisci un numero da 1 a 50");
					numero=input.nextInt();
				}while(numero>50 || numero<1);

				if (numero==generato) {
					System.out.println("Hai indovinato. Tentativi Utilizzati: " + (6-tentativi));
					break;
				}else if (numero>generato) {
					System.out.println("Hai inserito un numero maggiore. Tentativi Utilizzati: " + (6-tentativi));
				}else if (numero<generato) {
					System.out.println("Hai inserito un numero minore. Tentativi Utilizzati: " + (6-tentativi));
				}
			}

			if (tentativi==0) {
				 System.out.println("Testativi esauriti. Il numero e': " + generato);
			}
		}while(Test1.rigioca());*/
	}

	public static boolean rigioca(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuoi iniziare una nuova partita? Si/No");
		String rigioca = sc.next();
		if (rigioca.equalsIgnoreCase("SI"))return true;
		else return false;
		//return rigioca.equalsIgnoreCase("SI");
	}

	public static int generand(){
		int max= 50;
		int min= 1;
		int range=max-min+1;
		return (int)Math.rint((Math.random()*range)+min);
	}
}

