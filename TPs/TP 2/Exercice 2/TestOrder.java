import java.lang.*;
import java.util.Scanner;

public class TestOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez N : ");

        String str = scanner.nextLine();
        int val = Integer.parseInt(str);

        for(int i=1;i<=val;i++)
        {   
            new Compteur("Thread "+i+" : ", 5).start();
        }   
    }
}