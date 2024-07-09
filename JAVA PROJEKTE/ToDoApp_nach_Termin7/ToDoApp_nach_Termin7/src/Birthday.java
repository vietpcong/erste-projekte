public class Birthday extends Item {
    private String date;

    public Birthday(String aName, String aDescription, String aDate){
        super(aName, aDescription); //Konstruktor der Klasse Item wird aufgerufen.
        // Werte der Parameter aName und aDescription werden weitergegeben.

        //Birthday-spezifisches Attribute date wird anhand des Parameters aDate definiert.
        this.date = aDate;
    }

    // Getter-Methode
    public String getDate(){
        return this.date;
    }

    // Setter-Methode
    public void setDate(String aDate){
        this.date = aDate;
    }
    public void display(){
        System.out.print("Birthday mit ");
        super.display();
        System.out.println(", Date: " + this.date);
    }

    public String toString(){
        String s = "Birthday;" + super.toString() + ";" + this.date;
        return s;
    }
}