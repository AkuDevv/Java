import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileTest{
    public static void main(String[] args) {

        File f1 = new File("C:\\Users\\Client10\\SAFI - OURAHOU\\JAVA\\exemplesCours\\imputOutput\\Files\\doc.txt");
        File f2 = new File("C:\\Users\\Client10\\SAFI - OURAHOU\\JAVA\\exemplesCours\\imputOutput\\Files\\doc2.txt");
        // File f2 = new File("C:\\");
        // File f3 = new File("C:\\Users\\Client10\\SAFI - OURAHOU\\JAVA\\exemplesCours\\fichier.txt");
        
        // System.out.println(f1.getAbsolutePath());
        // System.out.println(f1.getName());
        // // System.out.println(f1.exists());
        // System.out.println(f2.isDirectory());
        // System.out.println(f2.isFile());
        // File[] list = f2.listFiles();
        // int n=0;
        // if(f2.exists())
        // {
        //     for(File i:list){
        //     System.out.printf("%d- %-15s \t",n+1,i.getName());
        //     n++;
        //     if((n%4) == 0) System.out.println();
        // }}
        //     else System.out.println("Ce dossier n existe pas");

        //f3.mkdir();
        //f3.delete();
        /* System.out.println(f1.mkdir());
        System.out.println(f1.delete()); */
        //FileInputStream fis = null;

        
/*         try{
        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);
        
        byte[]  buffer = new byte[4];
        int m = 0;
        while ((m = fis.read(buffer)) >= 0) {
            for(int i = 0; i < m; i++) {
                System.out.print((char)buffer[i]);
                fos.write(buffer[i]);
            }
            
        }
        fis.close();
        fos.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("fis :"+System.currentTimeMillis()); */
//-----------------------------------------------------------------
        try{
            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);
            InputStream bis = new  BufferedInputStream(fis);
            OutputStream bos = new  BufferedOutputStream(fos);
        
        byte[]  buffer = new byte[4];
        int m = 0;
        while ((m = bis.read(buffer)) >= 0) {
            for(int i = 0; i < m; i++) {
                System.out.print((char)buffer[i]);
                bos.write(buffer[i]);
            }
            
        }
        bis.close();
        bos.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("bis :"+System.currentTimeMillis());
        
        }
    }
