import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CDTest {
    public static void main(String[] args) {

        List<CD> cdList = new ArrayList<CD>();
        CD cd1 = new CD("Ourahou", "Hassae", 10.0);
        CD cd2 = new CD("Ridae", "Candide", 25.0);
        CD cd3 = new CD("Moujib", "La boite", 13.0);
        CD cd4 = new CD("James", "Kra", 78.0);

        cdList.add(cd1);
        cdList.add(cd2);
        cdList.add(cd3);
        cdList.add(cd4);
        
        System.out.println("Avant le tri ");

        Iterator<CD> it = cdList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        Collections.sort(cdList);
        System.out.println("Apres le tri");
        it = cdList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}