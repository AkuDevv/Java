package ds1_java;

import java.util.LinkedList;

public class MyBuffer {

	private LinkedList<String> donnee;
	private int leng;

	public MyBuffer(int size) {
		this.leng = size;
		donnee = new LinkedList<String>();
	}

	public synchronized void addWord(String w) throws InterruptedException {
		while(donnee.size() == this.getsize())
		wait();
		donnee.add(w);
		System.out.println("Ajouter un mot : "+w);
		notify();
	}
	public synchronized String getWord() throws InterruptedException {
		while(donnee.size()==0)
		wait();
		String a = donnee.poll();
		System.out.println("Get le mot : "+a);
		notify();
		return a;
	}
	public  LinkedList<String> getdata(){
		return donnee;
	}
	public int getsize() {
		return this.leng;
	}

}
