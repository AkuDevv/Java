public class EleveTest
{
    public static void main(String[] args) {
        Eleve e1 = new Eleve("James");

        e1.ajouterNote(15);
        e1.ajouterNote(17);
        e1.ajouterNote(5);

        System.out.println(e1);

    }
}