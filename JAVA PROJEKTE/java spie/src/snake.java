import java.awt.Point;
import java.util.Scanner;


public class snake {
    public static void main(String[] args) {
        //Objekte und Spielfeld erstellen
        Point spielerPosition = new Point(10, 9);
        Point schlangePosition = new Point(30, 2);
        Point goldPosition = new Point(6, 6);
        Point tuerPosition = new Point(2, 5);
        // Spielfeld 10x40
        boolean weiter = true;

        while (weiter) {
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 40; x++) {
                    Point p = new Point(x, y);
                    if (p.equals(spielerPosition))
                        System.out.print("P");
                    else if (p.equals(schlangePosition))
                        System.out.print("S");
                    else if (p.equals(goldPosition))
                        System.out.print("G");
                    else if (p.equals(tuerPosition))
                        System.out.print("T");
                    else
                        System.out.print("."); // print statt println -> breite statt höhe
                }
                System.out.println();
            }
            bewegeSpieler(spielerPosition); // Methode mit "alt" geklickt und enter für Methode erstellen
        }
    }

        private static void bewegeSpieler(Point spielerPosition) {
            Scanner scan = new Scanner(System.in);
            String input = scan.next();
            // Nutzer kann w,a,s,d eingeben
            // in Java geht koordinatensystem von obenn links nach unten rechts

            if (input.equals("w")) {
                if (spielerPosition.y > 0)
                    spielerPosition.y--;
            } else if (input.equals("s")) {
                if (spielerPosition.y < 9)
                    spielerPosition.y++;
            } else if (input.equals("a")) {
                if (spielerPosition.x > 0)
                    spielerPosition.x--;
            } else if (input.equals("d")) {
                if (spielerPosition.x < 40)
                    spielerPosition.x++;

            }

        }

    }


