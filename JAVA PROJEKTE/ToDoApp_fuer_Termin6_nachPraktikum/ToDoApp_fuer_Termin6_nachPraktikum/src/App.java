import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Administration admin = new Administration();
        // admin.loadAllToDos();
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.println("-----------------------------");
            System.out.println("Bitte Ihre Auswahl:");
            System.out.println("0 für Beenden, ");
            System.out.println("1 für CreateBirthday");
            System.out.println("2 für CreateToDo");
            System.out.println("3 für showAllBirthdays");
            System.out.println("4 für showAllToDos");
            System.out.println("6 für deleteToDo, 8 für changeToDo");
            System.out.println("-----------------------------");
            int auswahl = s.nextInt();
            if(auswahl==0){
                System.out.println("Anwendung wird beendet.");
                // admin.saveAllToDos();
                break;
            }
            else if(auswahl==1){
                admin.createBirthday();
            }
            else if(auswahl==2){
                admin.createToDo();
            }
            else if(auswahl==3){
                admin.showAllBirthdays();
            }
            else if(auswahl==4){
                admin.showAllToDos();
            }
            else if(auswahl==6){
                admin.deleteToDo();
            }
            else if(auswahl==8){
                admin.changeToDo();
            }

        }
    }
}
