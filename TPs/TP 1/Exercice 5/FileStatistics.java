import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileStatistics {
    private String fileName;

    public FileStatistics(String filename) {
        this.fileName = filename;
    }

    public int getCharCount() {
        int count = 0, i;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File(this.fileName)));
            while ((i = br.read()) >= 0)
                count++;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return count;

    }
    public int getWordCount(){
        int count = 0;
        String str = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File(this.fileName)));
            while ((str = br.readLine()) != null){
                String[] words ;
                words = str.replaceAll("[^a-zA-ZÇâêîôûéàèùëïüç ]", "").toLowerCase().split("\\s+");
                
                for(String w:words){  
                    if(!(w.isEmpty())){
                        count++;
                    }
                    }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return count;
    } 
    public int getSentanceCount(){
        int count = 0;
        String str = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File(this.fileName)));
            while ((str = br.readLine()) != null){
                String[] words ;
                words = str.split("[!?.:]+");
                for(String w:words){
                    if(!(w.isEmpty())){
                        count++;
                    }
                    }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return count;
    }
    public int getParagrapheCount(){
        int count = 0;
        String str = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File(this.fileName)));
            while ((str = br.readLine()) != null){
                if(!str.isEmpty()) count++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return count;
    }

    public void saveCounts(String filename){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(new File(filename)));
            bw.write("Characters Count is : " + this.getCharCount());
            bw.newLine();
            bw.write("Words Count is : " + this.getWordCount());
            bw.newLine();
            bw.write("Sentances Count is : " + this.getSentanceCount());
            bw.newLine();
            bw.write("Paragraphes Count is : " + this.getParagrapheCount());
            bw.newLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
    HashMap<String, Integer> getDictionary(){
        HashMap<String, Integer> dictionary= new HashMap<String, Integer>();
        String str = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File(this.fileName)));
            while ((str = br.readLine()) != null){
                String[] words ;
                words = str.replaceAll("[^a-zA-ZÇâêîôûéàèùëïüç ]", "").toLowerCase().split("\\s+");
                
                for(String w:words){  
                    if(!(w.isEmpty())){
                        if(dictionary.get(w) != null)
                        dictionary.put(w, dictionary.get(w)+1);
                        else dictionary.put(w, 1);
                    }
                    }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return dictionary;
    }
    public void saveDictionary(String filename){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(new File(filename)));
            bw.write("Dictionaire des mots est : ");
            bw.newLine();
            Set<Entry<String, Integer>> entrySet = this.getDictionary().entrySet();
            Iterator<Entry<String, Integer>> it = entrySet.iterator();
            while(it.hasNext()){
                Entry<String, Integer> entry = it.next();
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}