import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SoloTest{
    public static void main(String[] args) {
        Solo<Integer> s1 = new Solo<Integer>(44);
        Solo<String> s2 = new Solo<String>("hhhh");

        System.out.println(s1.getValeur());
        System.out.println(s2.getValeur());

//--------------------------List---------------------------------------------   

        ArrayList<String> list = new ArrayList<String>();

        list.add("Moujib");
        list.add("Ourahou");
        list.add("Hassae");
        list.add("James");
        list.add("Redae");
        list.add("Soussou");


        Iterator it = list.iterator();

        while(it.hasNext())
        {
            String str = (String) it.next();
            it.remove();
        }

        list.add("Hassae");
        System.out.println(list);

//---------------------------Map set---------------------------------------------
/*
        Map<Integer,String> map1 = new HashMap<Integer,String>();

        map1.put(3, "Moujib");
        map1.put(1, "Ourahou");
        map1.put(2, "Hassae");
        map1.put(4, "James");

        Set<Integer> key = map1.keySet();

        Iterator<Integer> it2 = key.iterator();

        while(it2.hasNext())
        {
            int key2 = it2.next();
            System.out.println("Valeur pour la cle "+key2+" = "+map1.get(key2));
        }
    }
}*/
//----------------------------------------Map setentry----------------------------

Map<Integer,String> map2 = new HashMap<Integer,String>();

map2.put(3, "Moujib");
map2.put(1, "Ourahou");
map2.put(2, "Hassae");
map2.put(4, "James");

Set<Entry<Integer,String>> keyset = map2.entrySet();

Iterator<Entry<Integer,String>> it3 = keyset.iterator();

while(it3.hasNext())
{
    Entry<Integer,String> entry = it3.next();
    System.out.println("Valeur pour la cle "+entry.getKey()+" = "+entry.getValue());
}
}
}


