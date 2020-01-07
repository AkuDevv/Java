import java.util.ArrayList;

public class Eleve 
{
    private String nom;
    private ArrayList<Integer> noteList ;
    private double moyenne;

    public Eleve(String nom)
    {
        this.nom = nom;
        this.moyenne = 0.0;
        this.noteList = new ArrayList<Integer>();
    }

    public double getMoyenne()
    {
        double totalNotes = 0;
        for(int note : noteList)
        {
            totalNotes += note;
        }
        this.moyenne = totalNotes/noteList.size();
        return this.moyenne;
    }

    public String getNom()
    {
        return this.nom;
    }

    public ArrayList<Integer> getListeNotes()
    {
        return this.noteList;
    }

    public void ajouterNote(int note)
    {
        this.noteList.add(note);
    }

    public String toString()
    {
        return "Eleve : "+this.getNom()+" - Notes : "+this.getListeNotes()+" Moyenne : "+this.getMoyenne();
    }
}