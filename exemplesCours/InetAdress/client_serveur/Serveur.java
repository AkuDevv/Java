import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

    public static void main(String[] args) {
        ServerSocket sSoc = null;
        Socket soc = null;
        
        try {
            sSoc = new ServerSocket(2024);
            soc = sSoc.accept();
            System.out.println("Le Client est connecte");
            sSoc.close();
            soc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}