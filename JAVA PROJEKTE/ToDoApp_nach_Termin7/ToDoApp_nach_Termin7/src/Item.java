public class Item {
    //Attribute deklarieren
    protected String name;
    protected String description;

    //Konstruktor implementieren
    public Item(String aName, String aDescription){
        this.name = aName; // Attribut name erhält den Wert des Parameters aName
        this.description = aDescription; // Attribut description erhält den Wert des Parameters aDescription
    }

    //Getter- und Setter-Methoden implementieren

    // Getter-Methoden geben den Wert des entsprechenden Attributes zurück, haben keine Parameter
    public String getName(){
        return this.name;
    }

    public String getDescription(){  // Rückgabetyp ist der Typ des zurückgegebenen Attributes
        return this.description;
    }

    public void setName(String aName){ //keine Rückgabe, Typ des Parameters ist Typ des Attributes
        this.name = aName;
    }

    public void setDescription(String aDescription){
        this.description = aDescription;
    }

    public void display(){
        System.out.print("Name: " + this.name + ", Description: " + this.description);
    }

    public String toString(){
        String s = this.name + ";" + this.description;
        return s;
    }

}
