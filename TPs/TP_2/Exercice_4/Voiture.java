class Voiture extends Thread {

    String identifiant;

    private Parking p;
    Voiture(String id, Parking p){
        this.p=p;
        this.identifiant = id;
    }

    public void demandRentrer(){
        System.out.println("Voiture : " + identifiant + " Demmande d'entrer ");
        if(p.entre(this)){
        System.out.println("La demand d'entrer de  Voiture : " + identifiant + "est acceptée");
        }
        else System.out.println("La demand d'entrer de  Voiture : " + identifiant + " est refusée");
    }

    public void demandSortir(){
        System.out.println("Voiture : " + identifiant + " Demand de Sortir");
        p.quitter(this);
        System.out.println("Voiture : " + identifiant + " a sorti");
    }

    public void waitAleatoire(){
        try {
            sleep(Math.round(Math.random() * 2000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public synchronized void  run(){
        this.demandRentrer();
        this.waitAleatoire();
        this.demandSortir();
    }

}
