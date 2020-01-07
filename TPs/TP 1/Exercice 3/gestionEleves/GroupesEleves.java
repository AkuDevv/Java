package gestionEleves;
import java.util.ArrayList;


public class GroupesEleves{

    private ArrayList<Eleve> listEleves;

    public GroupesEleves(){
        this.listEleves = new ArrayList<Eleve>();
    }
    public int nombre(){
        return listEleves.size();
    }
    public ArrayList<Eleve> getList(){
        return listEleves;
    } 
    public void ajouterEleve(Eleve eleve){
        this.listEleves.add(eleve);
    }
    public Eleve chercher(String nom){
        for(int i=0;i<this.nombre();i++){
            if(nom == this.listEleves.get(i).getNom())
                return this.listEleves.get(i);
        }
        return null;
    }
    public void lister(){
        for(int i=0;i<this.nombre();i++)
            System.out.println(this.listEleves.get(i).toString());   
    }
}
