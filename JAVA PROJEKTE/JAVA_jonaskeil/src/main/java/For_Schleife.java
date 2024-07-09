import java.util.Scanner;
public class For_Schleife {
    public static void main (String[] args) {
        // For: Code X-mal ausführen -> Abbruch Bedingung sparen
        Scanner s = new Scanner(System.in);
        int value1;
        int value2;
        System.out.println("Anfangswert");

        value1 = s.nextInt();
        System.out.println("Endwert");
        value2 = s.nextInt();
        for(int i = value1; i >= value2; i-- ) {
            System.out.println("Der Counter steht bei:" +i);
        }
    }
}
