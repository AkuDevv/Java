import java.math.*;

public class Compteur extends Thread
{
    int maxValue;
    String nom;

    Compteur(String n,int v)
    {
        this.nom = n;
        this.maxValue = v;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try{
        for(int i=1;i<=maxValue;i++)
        {
            System.out.println(this.nom+" : "+i);
            sleep((1000-500)*(long)Math.random());
        }
    }catch(InterruptedException e){
        return;
    }
    }

    public static void main(String[] args) {
        Thread t1 = new Compteur("Thread 1 ", 10);
        t1.start();
    }
}