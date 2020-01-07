public class Test {
    public static void main(String[] args) {

        int v=5;
        Valeur myval = new Valeur(v);

        Ajob a1 = new Ajob(myval,1);
        Ajob a2 = new Ajob(myval,-1);

        new Thread(a1).start();
        new Thread(a2).start();
    }
}