package ds1_java;

import java.io.*;

public class Lecteur extends Thread {

	private String nomFichier;
	private String nomThread;
	private MyBuffer buf;
	BufferedInputStream bis;
	public static int nbr = 0;

	public Lecteur(String threadName, String fileName, MyBuffer buff) throws FileNotFoundException {
		this.nomThread = threadName;
		this.nomFichier = fileName;
		this.buf = buff;
		bis = new BufferedInputStream(new FileInputStream(new File(this.nomFichier)));
	}

	public String readWord() throws IOException {
		byte[] b = new byte[1];
		int n = 0;
		String word ="";
		while ((n = this.bis.read(b)) >= 0 && Character.toString((char) b[0]).matches("\\w")&&((char) b[0])!='\n') {
			word += (char) b[0];
		}
		nbr = n;
		return word;
	}

	public void run() {
		while (true) {
			try {
				String s=readWord();
				if(s!="")
				buf.addWord(s);
				if(nbr==-1) break;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
