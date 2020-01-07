import java.util.ArrayList;


class Test {
    public static void main(String[] args) {

        int i=0;

        Parking park = new Parking(3);

        ArrayList<Voiture> listVoiture = new ArrayList<Voiture>();

        listVoiture.add(new Voiture("Voiture 1",park));
        listVoiture.add(new Voiture("Voiture 2",park));
        listVoiture.add(new Voiture("Voiture 3",park));
        listVoiture.add(new Voiture("Voiture 4",park));

        System.out.println(listVoiture.size());

        while (true){
                if(!listVoiture.get(i).isAlive()){
                    listVoiture.get(i).run();
                }
                i = (i+1)%listVoiture.size();
        }
    }
}

/* le problem c'est qui'il faut utiliser la methode .run() 
 au lieu de .start() pour eviter appelation de thread qui
 il est en train d'execution*/
