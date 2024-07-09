public class ToDo extends Item{
    private String tag;
    private String deadline;

    public ToDo(String aName, String aDescription, String aTag, String aDeadline){
        super(aName, aDescription); //Konstruktor der Klasse Item wird aufgerufen.
        // Werte der Parameter aName und aDescription werden weitergegeben.

        //Nun werden noch die weiteren beiden Attribute der Klasse ToDo definiert.
        this.tag = aTag;
        this.deadline = aDeadline;
    }

    public String getTag(){
        return this.tag;
    }

    public void setTag(String aTag){
        this.tag = aTag;
    }
    public String getDeadline(){
        return this.deadline;
    }

    public void setDeadline(String aDeadline){
        this.deadline = aDeadline;
    }
}


