import java.util.HashSet;
import java.util.Set;

class Parking {

    private Set<Voiture> parkedVoitures;
    private int nPlaces;

    Parking(int nPlaces){
        this.nPlaces = nPlaces;
        this.parkedVoitures = new HashSet<Voiture>();
    }

    public boolean entre(Voiture v){
        if (this.parkedVoitures.size() < nPlaces){
            return this.ajouterVoiture(v);       
        }
        return false;
    }

    public void quitter(Voiture v){
        if(this.parkedVoitures.contains(v)){
        this.parkedVoitures.remove(v);
    }
        else System.out.println("Cette Voiture n'est pas dans le park");
    }

    public boolean ajouterVoiture(Voiture v){
        if(!this.parkedVoitures.contains(v)){
            this.parkedVoitures.add(v);
            return true;
        }
        else {
            System.out.println("Cette voiture est deja dans ce park");
            return false;
        }
    }
}
