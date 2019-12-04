import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) {
        Socket soc = null;

        try {
            soc = new Socket(InetAddress.getByName("192.168.1.3"), 2024);
            BufferedOutputStream bos = new BufferedOutputStream(soc.getOutputStream());
            bos.write("cc\n".getBytes());
            bos.flush();
            soc.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}