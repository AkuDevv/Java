public class Valeur{
    int valeur;

    Valeur(int vleur)
    {
        this.valeur = vleur;
    }

    public int getVal()
    {
        return this.valeur;
    }

    public synchronized void add(int i)
    {
        this.valeur += i;
    }

    public String toString(){
        return ("Valeur : "+this.getVal());
    }
}