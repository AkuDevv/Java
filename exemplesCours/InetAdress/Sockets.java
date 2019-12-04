import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sockets {
    public static void main(String[] args) {
        for(int i=79;i<65536;i++){
        try {
                Socket soc = new Socket(InetAddress.getLocalHost(),i);
                if(soc != null){
                    System.out.println("Le port : "+i+" est libre.");
                }
            }
            //Socket soc = new Socket("www.google.com",80);
            catch (UnknownHostException e) {
            //TODO: handle exception
            //e.printStackTrace();
        }
        catch(IOException e){//e.printStackTrace();
        }

    }
}
}