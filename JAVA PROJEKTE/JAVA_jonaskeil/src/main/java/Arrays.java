public class Arrays {
    public static void main (String[] args) {
// arrays lassen dich mehrere Objekte des gleihcen datentyps speichern
// Beispiel Werkzeugkasten

           int[] numbers = new int[1000];

           for (int i = 0; i < numbers.length; i++) {
               numbers[i] = i + 1;
               System.out.println(numbers[i]);
           }



    }
}
