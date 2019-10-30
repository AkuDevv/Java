import java.util.ArrayList;
import java.util.Iterator;

public class GroupeEleves
{
    private ArrayList<Eleve> list = new ArrayList<Eleve>();

    public int nombre()
    {
        return this.list.size();
    }

    public ArrayList<Eleve> getListe()
    {
        return this.list;
    }

    public void ajouterEleve(Eleve eleve)
    {
        this.list.add(eleve);
    }

    public Eleve chercher(String nom)
    {
        for(int i = 0;i<list.size();i++)
        {
            if(list.get(i).getNom() == nom) return list.get(i);
        }
        return new Eleve("");
    }

    public void lister()
    {
        Iterator<Eleve> it = this.list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}