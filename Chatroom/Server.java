import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("---Serveur----");
        ServerSocket serverSocket = null;
        int port = 5000;
        int nbr = 0;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Serveur ok sur le port : "+port);
        } catch (IOException e) {
            System.out.println("Impossible de creer le serveur sur le port "+port);
        }

        while(true){
            Socket clientSocket = null;
            try{
                clientSocket = serverSocket.accept();
                nbr++;
                System.out.println("Client : "+nbr);
                executeClient(clientSocket);
            }
            catch(IOException e){
                System.out.println("Error : cannot accept client request !!");
            }
        }
    }

    public static void executeClient(Socket clinSocket) throws IOException {
        try {
            PrintStream printStream = new PrintStream(clinSocket.getOutputStream());
            InputStreamReader is = new InputStreamReader(clinSocket.getInputStream());
            BufferedReader br = new BufferedReader(is);

            String msg = null;

            msg = br.readLine();
          //  Thread.sleep(3000);

            String sendMsg = "Response : "+msg;
            printStream.println(sendMsg);
            printStream.flush();
            printStream.close();
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}