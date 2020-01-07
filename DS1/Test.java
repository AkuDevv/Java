package ds1_java;

import java.io.*;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) throws IOException {

		MyBuffer buf=new MyBuffer(200);

		Lecteur l=new Lecteur("Lecteur", "File.txt", buf);
		
		Processor p=new Processor(buf, "P");

		l.start();
		p.start();

		while(l.isAlive()) {}
		
		Set<Entry<String,Integer>>set=p.getWordsCounts().entrySet();
		Iterator<Entry<String,Integer>>it=set.iterator();
		while(it.hasNext()) {
			Entry<String,Integer>d=it.next();
			System.out.println(d.getKey()+" "+d.getValue());
		}
	}
}
