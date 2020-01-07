import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Socket clientSocket = null;
        String serverName = "localhost";
        int port = 5000;
        try {
            clientSocket = new Socket(serverName,port);
        } catch (Exception e) {
            System.out.println("Client : impossible de suivre le socket du serveur");
        }
        try {
            PrintStream pr = new PrintStream(clientSocket.getOutputStream());
            InputStreamReader is = new InputStreamReader(clientSocket.getInputStream());

            BufferedReader bf = new BufferedReader(is);

            System.out.println("Entrez votre message : ");
            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();
            sc.close();

            pr.println(msg);
            pr.flush();
            System.out.println("Me : "+msg);


            msg = bf.readLine();
            System.out.println(msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}