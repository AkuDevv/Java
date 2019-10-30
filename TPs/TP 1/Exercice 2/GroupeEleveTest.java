public class GroupeEleveTest
{
    public static void main(String[] args) {
        
        GroupeEleves gr1 = new GroupeEleves();

        Eleve e1 = new Eleve("Hassae");
        Eleve e2 = new Eleve("Ridae");
        Eleve e3 = new Eleve("Bahae");

        e1.ajouterNote(10);
        e1.ajouterNote(12);
        e1.ajouterNote(3);

        e2.ajouterNote(15);
        e2.ajouterNote(10);
        e2.ajouterNote(13);

        e3.ajouterNote(14);
        e3.ajouterNote(12);
        e3.ajouterNote(1);



        gr1.ajouterEleve(e1);
        gr1.ajouterEleve(e2);
        gr1.ajouterEleve(e3);

        gr1.lister();
    }
}