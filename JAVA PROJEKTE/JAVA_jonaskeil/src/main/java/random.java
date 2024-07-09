import javax.sound.midi.SysexMessage;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random random = new Random();
        String konsonanten = "BCDFGHJKLMNPQRSTVWXYZ";
        String vokale = "AEIOU";
        String wort = "";



        for (int i = 0; i < 5; i++) {

            if (i == 0 || i == 2 || i == 4) {
                int stelle1 = random.nextInt(21);
                wort += konsonanten.charAt(stelle1);
            }
            else{
                int stelle2 = random.nextInt(4);
                wort+= vokale.charAt(stelle2);
            }
        }
        System.out.println(wort);

    }
}