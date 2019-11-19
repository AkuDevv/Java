class Compte extends Thread {

    String name;
    int valeur;

    Compte(String name,int val){
        valeur = val;
        this.name = name;
    }

    public void run() {
        try{
            while(valeur <= 20){
                System.out.println(this.name + ":" + valeur);
                valeur++;
                sleep(1000);
            }
            System.out.println("fin !");
        }catch(InterruptedException e)
        {
            return;
        }
    }
    public static void main(String[] args) {
        Compte c = new Compte("T1", 2);
        c.start();

        Compte c2 = new Compte("T2", 3);
        c2.start();

        
    }
}