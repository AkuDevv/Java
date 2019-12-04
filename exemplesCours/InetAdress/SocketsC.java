import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

public class SocketsC {
    public static void main(String[] args) {
        Socket soc = null;
        try {
            soc = new Socket("www.este.ucam.ac.ma",80);
            String req = "GET / HTTP/1.1\r\n";
            req += "Host : www.este.ucam.ac.ma\r\n";
            req += "\r\n";
            BufferedOutputStream bos = new BufferedOutputStream(soc.getOutputStream());
            bos.write(req.getBytes());
            bos.flush();
            BufferedInputStream bis = new BufferedInputStream(soc.getInputStream());
            StringBuilder sb = new StringBuilder();
            int n;
            while((n = bis.read())!= -1){
                sb.append((char)n);
            }
            System.out.println("Input :"+sb);
        } catch (UnknownHostException e) {
            //TODO: handle exception
            e.printStackTrace();
        }catch(IOException e){e.printStackTrace();}
    }
}