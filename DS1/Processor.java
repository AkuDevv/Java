package ds1_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Processor extends Thread{
	private MyBuffer buf;
	private String nomP;
	private HashMap<String,Integer> nbrMots;
	public Processor(MyBuffer buff,String PName) {
		this.buf=buff;
		this.nomP=PName;
		nbrMots=new HashMap<String, Integer>();
	}

	public void run() {
		while(true){
			try {
				this.processe();
				if(Lecteur.nbr==-1) break;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public HashMap<String,Integer> getWordsCounts(){
		return  nbrMots;
	}

	public void processe() throws InterruptedException {
		String a=buf.getWord();
		int c=0;
		Set<Entry<String,Integer>>set=nbrMots.entrySet();
		Iterator<Entry<String,Integer>>it=set.iterator();
		while(it.hasNext()) {
			Entry<String,Integer>d=it.next();
			if(a.equals(d.getKey())) c=d.getValue();
		}
		if(nbrMots.containsKey(a)) {
			nbrMots.put(a,c+1);
		}else
		nbrMots.put(a,1);
	}


}