import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {
    public static void main(String[] args) {
        System.out.println("----------------------Serveur------------------");
        ServerSocket serverSocket = null;
        int port = 3024;
        int nbr = 0;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("SERVEUR : OK sur le port : "+port);
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("Impossible de creer le serveur sur le port "+port);
        }
        while(true){
            Socket clientSocket = null;
            try {
                clientSocket = serverSocket.accept();
                nbr++;
                System.out.println("Clients : "+nbr);
                processClientRequest(clientSocket);
            } catch (IOException e) {
                //TODO: handle exception
                System.out.println("Error : cannot accept client request. Exit program...");
            }
        }
    }

    public static void processClientRequest(Socket clientSocket) throws IOException{
        try{
            PrintStream printStream = new PrintStream(clientSocket.getOutputStream());
            InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStream);
            String message = null;
            message = bufferedReader.readLine();
            Thread.sleep(1000);
            String messageSend = "Serveur : "+message+"\n";
            printStream.println(messageSend);
            printStream.close();
        }catch(Exception e){
            System.out.println("Serveur : probleme d'envoi du message");
        }
        finally{
            return;
        }
    }
}