import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.*;

public class ObjectIO
{
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Client10\\SAFI - OURAHOU\\JAVA\\exemplesCours\\imputOutput\\Files\\game.txt");
        ObjectInputStream ois;
        ObjectOutputStream oos;


        try{
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f1)));
            oos.writeObject(new Game("Fortnite","Battle Royale",0,"Moujib",10));
            oos.writeObject(new Game("FIFA 20","Sports",60.99,"Jims",17));
            oos.close();
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f1)));
            try{
                System.out.println(((Game)ois.readObject()).toString());
                System.out.println(((Game)ois.readObject()).toString());
            }
            catch(ClassNotFoundException e){e.printStackTrace();}
            ois.close();
        }catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
    }
}