import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    
    static ConcurrentHashMap<String, Socket> activeClients = new ConcurrentHashMap<String, Socket>();
    public static void main(String[] args) {
        System.out.println("---Serveur----");
        ServerSocket serverSocket = null;
        int port = 5000;
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
                activeClients.put(clientSocket.getInetAddress().getHostAddress(), clientSocket);
                executeClient(clientSocket);
            }
            catch(IOException e){
                System.out.println("Error : cannot accept client request !!");
            }
        }
    }

    public static void executeClient(Socket clinSocket) throws IOException {
        try {
            InputStreamReader is = new InputStreamReader(clinSocket.getInputStream());
            BufferedReader br = new BufferedReader(is);

            String msg = null;
            msg = br.readLine();

            for(String clientHost : activeClients.keySet()) {
                Socket s =  activeClients.get(clientHost);
                PrintStream printStream = new PrintStream(s.getOutputStream());
                printStream.println(msg);
                printStream.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}