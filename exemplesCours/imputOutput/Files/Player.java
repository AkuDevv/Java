import java.io.Serializable;

class Player implements Serializable 
{
    private String nom;
    private int age;

    public Player(String n,int a)
    {
        this.nom = n;
        this.age = a;
    }

    public String getName()
    {
        return this.nom;
    }

    public int getAge()
    {
        return this.age;
    }

    public String toString()
    {
        return "Player name : "+this.nom+"\nPlayer age : "+this.age+"\n";
    }
}