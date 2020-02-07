/**
 * Created by Fefe on 07/02/20.
 */

public class Calcolatrice {
    public static void addizione(String s1, String s2) {
        try {
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        } catch (NumberFormatException e) {
            System.out.println("I valori inseriti non sono corretti.");
        }
    }

    public static void sottrazione(String s1, String s2) {
        try {
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        } catch (NumberFormatException e) {
            System.out.println("I valori inseriti non sono corretti.");
        }
    }

    public static void moltiplicazione(String s1, String s2) {
        try {
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        } catch (NumberFormatException e) {
            System.out.println("I valori inseriti non sono corretti.");
        }
    }

    public static void divisione(String s1, String s2) {
        try {
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);

            if (n1 == 0 && n2 == 0) {
                throw new ArithmeticException("Impossibile fare 0/0");
           } else if (n2 == 0) {
                throw new ArithmeticException("Impossibile dividere per 0.");
            }

            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        } catch (NumberFormatException e) {
            System.out.println("I valori inseriti non sono corretti.");

        } 
				catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
