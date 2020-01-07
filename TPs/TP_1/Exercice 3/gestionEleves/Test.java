class Test {
    public static void main(String[] args) {

        Eleve e1 = new Eleve("khalid");

        e1.ajouterNote(7);
        e1.ajouterNote(12);
        e1.ajouterNote(6);
        System.out.println(e1);

        Eleve e2 = new Eleve("aissam");
        e2.ajouterNote(17);
        e2.ajouterNote(15);
        e2.ajouterNote(19);
        System.out.println(e2);

        Eleve e3 = new Eleve("bahae");
        e3.ajouterNote(15);
        e3.ajouterNote(13);
        e3.ajouterNote(17);
        System.out.println(e3);

        System.out.println(e2.compareTo(e2));

        GroupesEleves groupe = new GroupesEleves();

        groupe.ajouterEleve(e1);
        groupe.ajouterEleve(e2);
        groupe.ajouterEleve(e3);
        groupe.lister();

        System.out.println(groupe.chercher("bahae"));
    }
}
