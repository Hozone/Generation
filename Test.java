import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
		System.out.println("Inserisci il numero di righe: ");
		Scanner input = new Scanner(System.in);
		int righe = input.nextInt();

		/*for(int i=1; i<=righe; i++){
			for(int j=0; j<i; j++){
				System.out.print(i);
			}
			System.out.println("");
		}
		int i = 1;
		while(i<=righe){
			int j=0;
			while(j<i){
				System.out.print(i);
				j++;
			}
			System.out.println("");
			i++;
		}
		int i=1;
		do{
			int j=0;
			do{
				System.out.print(i);
				j++;
			}while(j<i);
			System.out.println("");
			i++;
		}while(i<=righe);*/
	}
}