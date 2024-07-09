public class Methoden_2 {
    public static void main(String[] args) {


        addieren(5, 3); // int werden deklariert
        sub(5,3);
        mult(5,3);
        div(5,3);

    }

    public static void addieren(int zahl1, int zahl2) { // rechne Methode es werden 2 int benötigt
        int summe1 = zahl1 + zahl2;
        System.out.println(summe1);
    }

    public static void sub(int zahl1, int zahl2) {
        int summe2 = zahl1 - zahl2;
        System.out.println(summe2);
    }

    public static void mult(int zahl1, int zahl2) {
        int erg3 = zahl1 * zahl2;
        System.out.println(erg3);
    }
    public static void div(double zahl1, double zahl2) {
        double erg4 = zahl1 / zahl2;
        System.out.println(erg4);
    }
}
