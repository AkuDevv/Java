package gestionEleves;
import java.util.ArrayList;
import java.util.Collections;

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
    public Eleve meilleurEleve(){
        return Collections.max(this.listEleves);
    }
    public void trierEleves(String ordre){
        if(!this.listEleves.isEmpty()){
            Collections.sort(this.listEleves);
        if(ordre == "decroissant")
        Collections.sort(this.listEleves,Collections.reverseOrder());
        }
        else System.out.println("La lsit des eleves est vide");
        
    }
}