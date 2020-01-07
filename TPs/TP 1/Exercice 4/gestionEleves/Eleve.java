package gestionEleves;

import java.util.ArrayList;
import java.lang.Comparable;

public class Eleve implements Comparable<Eleve>{
    
    private String nom;
    private ArrayList<Integer> notes;
    private double moyenne;

    public Eleve(String nom){
        this.nom = nom;
        this.moyenne = 0;
        this.notes = new ArrayList<Integer>();
    }

    public double getMoyenne(){
        return this.moyenne;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void ajouterNote(int note){
        this.notes.add(note);
        calculerMoyenne();
    }
    
    public void calculerMoyenne(){
        int some = 0;
        for(int i = 0; i < this.notes.size(); i++){
            some += this.notes.get(i);
        }
        this.moyenne =  some/this.notes.size();
    }

    public String toString(){
        String notes = "";
        for(int i = 0; i < this.notes.size(); i++)
            notes += " "+this.notes.get(i)+",";
        return "Eleve[nom : "+this.nom+", moyenne : "+this.moyenne+", notes : ("+notes+")]";
    }

    public ArrayList<Integer> getNotesList(){
        return this.notes;
    }
    
    public int compareTo(Eleve autreEleve){
        if(autreEleve.getClass().equals(Eleve.class)){
            Eleve eleve = (Eleve)autreEleve;
            return Double.compare(this.moyenne, eleve.getMoyenne());
        }
        return -1;
    }


}