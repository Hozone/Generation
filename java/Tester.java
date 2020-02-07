/**
 * Created by Fefe on 07/02/20.
 */

import javax.swing.JOptionPane;

public class Tester {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Inserire primo valore");
        String input2 = JOptionPane.showInputDialog("Inserire secondo valore");
        String input3 = JOptionPane.showInputDialog("Scegli l'operazione:\n"
                + "1: " +"Addiziona\n2: Sottrai\n3: Moltiplica\n4: Dividi");

        try {
            int scelta = Integer.parseInt(input3);

            switch (scelta) {
                case 1:
                    Calcolatrice.addizione(input1, input2);
                    break;
                case 2:
                    Calcolatrice.sottrazione(input1, input2);
                    break;
                case 3:
                    Calcolatrice.moltiplicazione(input1, input2);
                    break;
                case 4:
                    Calcolatrice.divisione(input1, input2);
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Il valore inserito non corrisponde ad una scelta.");
        }

        System.out.println("Fine del programma.");
    }
}
