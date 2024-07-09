import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

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
                System.out.print("Position " + i + ": ");
                b.display();
                // System.out.print("Nachster Birthday an Position: " + i);
                // System.out.print(": Name: " + b.getName());
                // System.out.print(", Description: " + b.getDescription());
                // System.out.println(", Date: " + b.getDate());
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
                System.out.print("Position " + i + ": ");
                aktuellesToDo.display();
                // System.out.print(": Name: " + aktuellesToDo.getName());
                // System.out.print(", Description: " + aktuellesToDo.getDescription());
                // System.out.print(", Tag: " + aktuellesToDo.getTag());
                // System.out.println(", Deadline: " + aktuellesToDo.getDeadline());
            }
        }
        System.out.println("-----------------------------");
    }

    public void showAllToDosAndBirthdays(){
        System.out.println("-------- vorhandene Items: --------");
        for(int i=0; i<this.toDoAndBirthdayList.size(); i++){
            // this.toDoAndBirthdayList.get(i).display();
            Item item = this.toDoAndBirthdayList.get(i);
            item.display();
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

    public void deleteBirthday(){
        this.showAllBirthdays();
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Position des zu löschenden Birthdays ein: ");
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

    public void saveAllToDosAndBirthdays() throws Exception{
        PrintWriter toDosToFileWriter = new PrintWriter(new FileWriter("ToDoDatei.txt"));
        for(int i=0; i<this.toDoAndBirthdayList.size(); i++){
            Item aktuellesItem = this.toDoAndBirthdayList.get(i);
            toDosToFileWriter.println(aktuellesItem.toString());
        }
        toDosToFileWriter.close();
    }

    public void loadAllToDosAndBirthdays() throws Exception{
        FileReader charsFromFile = new FileReader("ToDoDatei.txt");
        BufferedReader linesFromFile = new BufferedReader(charsFromFile);
        while(true){
            String line = linesFromFile.readLine();
            if(line==null){
                break;
            }
            String[] elements = line.split(";");
            if(elements[0].equals("ToDo")){
                String name = elements[1];
                String description = elements[2];
                String tag = elements[3];
                String deadline = elements[4];
                ToDo t = new ToDo(name, description, tag, deadline);
                this.toDoAndBirthdayList.add(t);
            } else if(elements[0].equals("Birthday")){
                String name = elements[1];
                String description = elements[2];
                String date = elements[3];
                Birthday b = new Birthday(name, description, date);
                this.toDoAndBirthdayList.add(b);
            }
            
        }
        linesFromFile.close();
    }
}
