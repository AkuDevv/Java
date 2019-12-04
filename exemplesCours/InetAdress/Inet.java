import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Inet {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisissez une addresse (IPv4 ou nom de domaine) : ");
            String add = sc.nextLine();
            InetAddress address = InetAddress.getByName(add);
            System.out.println("Nom : "+address.getHostName());
            System.out.println("Addresse : "+address.getHostAddress());
            System.out.println("Nom Canonique : "+address.getCanonicalHostName());
        } catch (UnknownHostException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}