public class experiment {
    public static void main(String[] args) {
        double[] ergebnisse = {1.1,2.45,3.5,4,5};
        double sum = 0;

        for (int i = 0; i < ergebnisse.length; i++) {
            sum += ergebnisse[i];
        }
        System.out.println(sum / ergebnisse.length);
    }
}
