import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class TCPClientTest {
    public static void main(String[] args) {
        System.out.println("-----------------------Client--------------------");
        Socket clientSocket = null;
        String serverHostName = "localhost";
        int port = 3024;
        try {
            clientSocket = new Socket(serverHostName,port);
        } catch (IOException e){
            //TODO: handle exception
            System.out.println("CLIENT : impossible de suivre le socket du serveur");
        }
        try{
        long t = System.currentTimeMillis();
        PrintStream printStream = new PrintStream(clientSocket.getOutputStream());
        InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStream);
        String message = "Bonjour \n\n";

        t=System.currentTimeMillis();
        printStream.print(message);
        printStream.flush();
        message = bufferedReader.readLine();
        System.out.println("SERVEUR : "+(System.currentTimeMillis()-t));
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}