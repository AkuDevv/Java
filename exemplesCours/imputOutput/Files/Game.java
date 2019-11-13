import java.io.Serializable;

public class Game implements Serializable{

    private String nom , style;
    private double prix;
    private transient Player player;

    public Game(String nom,String style,double prix,String pname,int page)
    {
        this.nom = nom;
        this.style = style;
        this.prix = prix;
        this.player = new Player(pname, page);
    }

    public String toString()
    {
        return "Nom : "+this.nom+"\nStyle : "+this.style+"\nPrix : "+this.prix+"\nPlayer : "+this.player.getName()+"Age : "+this.player.getAge();
    }
}