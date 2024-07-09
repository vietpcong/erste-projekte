import java.util.ArrayList;
import java.util.Scanner;

public class Administration {
    ArrayList<Item> toDoAndBirthdayList; // Deklaration des Attributes toDoAndBirthdayList

    public Administration(){
        this.toDoAndBirthdayList = new ArrayList<Item>(); // Im Konstruktor wird die toDoAndBirthdayList
        // erstellt
    }

    public void createBirthday(){
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte Name des Birthdays eingeben: ");
        String nameEingabe = s.nextLine();
        System.out.println("Bitte Description des Birthdays eingeben: ");
        String descriptionEingabe = s.nextLine();
        System.out.println("Bitte Datum des Birthdays eingeben: ");
        String datumEingabe = s.nextLine();
        Birthday b = new Birthday(nameEingabe, descriptionEingabe, datumEingabe);
        this.toDoAndBirthdayList.add(b);
    }

    public void createToDo(){
        Scanner s = new Scanner (System.in);
        System.out.println("Bitte Name des ToDo's eingeben");
        String nameEingabe = s.nextLine();
        System.out.println("Bitte Description des ToDo's eingeben");
        String descriptionEingabe = s.nextLine();
        System.out.println("Bitte Tag eingeben: ");
        String tagEingabe = s.nextLine();
        System.out.println("Bitte Deadline eingeben: ");
        String deadlineEingabe = s.nextLine();
        ToDo t = new ToDo(nameEingabe,descriptionEingabe, tagEingabe, deadlineEingabe);
        this.toDoAndBirthdayList.add(t);
    }
    public void showAllBirthdays(){
        System.out.println("-------vorhandene Birthdays: --------");
        // mit einer for-Schleife durch die ToDoAndBirthdayList laufen
        for(int i=0; i<this.toDoAndBirthdayList.size();i++){
            if(this.toDoAndBirthdayList.get(i) instanceof Birthday){
                Birthday b = (Birthday) this.toDoAndBirthdayList.get(i);
                System.out.print("Nachster Birthday an Position: " + i);
                System.out.print(": Name: " + b.getName());
                System.out.print(", Description: " + b.getDescription());
                System.out.println(", Date: " + b.getDate());
            }
        }
    }
    public void showAllToDos(){
        System.out.println("-------- vorhandene ToDos: --------");
        for(int i=0; i<this.toDoAndBirthdayList.size(); i++){
            if (this.toDoAndBirthdayList.get(i) instanceof ToDo){ // Überprüfung, ob Element 
                // an der aktuellen Listenposition vom Typ ToDo ist

                // Typcast des aktuellen Elementes in ein ToDo-Objekt
                ToDo aktuellesToDo = (ToDo) this.toDoAndBirthdayList.get(i); 
                System.out.print("Nächstes ToDo an Position " + i);
                System.out.print(": Name: " + aktuellesToDo.getName());
                System.out.print(", Description: " + aktuellesToDo.getDescription());
                System.out.print(", Tag: " + aktuellesToDo.getTag());
                System.out.println(", Deadline: " + aktuellesToDo.getDeadline());
            }
        }
        System.out.println("-----------------------------");
    }

    public void deleteToDo(){
        this.showAllToDos();
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Position des zu löschenden ToDos ein: ");
        int i = s.nextInt();
        this.toDoAndBirthdayList.remove(i);
    }

    public void changeToDo(){
        this.showAllToDos();
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Position des zu ändernden ToDos ein: ");
        int i = s.nextInt();
        if (this.toDoAndBirthdayList.get(i) instanceof ToDo){
            ToDo aktuellesToDo = (ToDo) this.toDoAndBirthdayList.get(i);
            System.out.println("Bitte geben Sie einen neuen Tag ein: ");
            String tagEingabe = s.next();
            aktuellesToDo.setTag(tagEingabe);
            System.out.println("Bitte geben Sie eine neue Deadline ein: ");
            String deadlineEingabe = s.next();
            aktuellesToDo.setDeadline(deadlineEingabe);
            this.showAllToDos();
        }
        
    }

    // public void saveAllToDos() throws Exception{
    //     PrintWriter toDosToFileWriter = new PrintWriter("ToDoDatei.txt");
    //     for(int i=0; i<this.toDoAndBirthdayList.size(); i++){
    //         ToDo aktuellesToDo = this.toDoAndBirthdayList.get(i);
    //         toDosToFileWriter.println("Todo;" + aktuellesToDo.getTag()+";"+aktuellesToDo.getDeadline());
    //     }
    //     toDosToFileWriter.close();
    // }

    // public void loadAllToDos() throws Exception{
    //     FileReader charsFromFile = new FileReader("ToDoDatei.txt");
    //     BufferedReader linesFromFile = new BufferedReader(charsFromFile);
    //     while(true){
    //         String line = linesFromFile.readLine();
    //         if(line==null){
    //             break;
    //         }
    //         String[] elements = line.split(";");
    //         String tag = elements[1];
    //         String deadline = elements[2];
    //         ToDo t = new ToDo(tag, deadline);
    //         this.toDoAndBirthdayList.add(t);
    //     }
    //     linesFromFile.close();
    // }
}
