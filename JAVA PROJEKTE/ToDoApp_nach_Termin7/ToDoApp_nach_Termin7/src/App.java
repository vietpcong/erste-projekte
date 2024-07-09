import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Administration admin = new Administration();
        admin.loadAllToDosAndBirthdays();
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.println("-----------------------------");
            System.out.println("Bitte Ihre Auswahl:");
            System.out.println("0 für Beenden, ");
            System.out.println("1 für CreateBirthday");
            System.out.println("2 für CreateToDo");
            System.out.println("3 für showallToDosAndBirthdays");
            System.out.println("4 für showAllBirthdays");
            System.out.println("5 für showAllToDos");
            System.out.println("6 für deleteToDo");
            System.out.println("7 für deleteBirthday");
            System.out.println("8 für changeToDo");
            System.out.println("-----------------------------");
            int auswahl = s.nextInt();
            if(auswahl==0){
                System.out.println("Anwendung wird beendet.");
                admin.saveAllToDosAndBirthdays();
                break;
            }
            else if(auswahl==1){
                admin.createBirthday();
            }
            else if(auswahl==2){
                admin.createToDo();
            }
            else if(auswahl==3){
                admin.showAllToDosAndBirthdays();
            }
            else if(auswahl==4){
                admin.showAllBirthdays();
            }
            else if(auswahl==5){
                admin.showAllToDos();
            }
            else if(auswahl==6){
                admin.deleteToDo();
            }
            else if(auswahl==7){
                admin.deleteBirthday();
            }
            else if(auswahl==8){
                admin.changeToDo();
            }

        }
    }
}
