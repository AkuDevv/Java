public class CD implements Comparable<CD> {
    private String auteur , titre;
    private double prix;
    public CD(String auteur,String titre,double prix)
    {
        this.auteur = auteur;
        this.titre = titre;
        this.prix = prix;
    }
    public String toString(){
        return "CD [Auteur : "+auteur+" ,Titre : "+titre+" ,Prix : "+prix+" ]";
    }

    public String getAuteur()
    {
        return this.auteur;
    }
    public String getTitre()
    {
        return this.titre;
    }
    public double getPrix()
    {
        return this.prix;
    }
@Override
    public int compareTo(CD cd)
    {
        if(this.getPrix()==cd.getPrix())
        {
            return 0;
        }
        else if(this.getPrix() > cd.getPrix() ) return 1;
        else return -1;
    }
}