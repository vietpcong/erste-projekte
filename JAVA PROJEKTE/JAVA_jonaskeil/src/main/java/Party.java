import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Party {
    public static void main (String[] args){
        int guests;
        Scanner scan = new Scanner(System.in);
        boolean weiter = true;

        System.out.println("Anzahl der Gäste: ");
        guests = scan.nextInt();

        while(weiter) {
            System.out.println("+X Gäste anmelden, -X Gäste abmelden, beenden ");
            int value = scan.nextInt();
            if(value == 0){
            break;}
            if (value >0){
            for (int i = 0; i < value; i++) {
                System.out.println("Gast angemeldet");
                guests++;
            }
            }
            if(value < 0){
                for (int i = 0; i > value; i--) {
                System.out.println("Gast abgemeldet");
                guests--;

                }
            }
            System.out.println("Anzahl der gemeldetetn huzndesäöhne: " +guests);

            }

            }


        }



