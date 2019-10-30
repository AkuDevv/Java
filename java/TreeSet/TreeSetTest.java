import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> tree = new TreeSet<String>();
        tree.add("Ourahou");
        tree.add("Moujib");
        tree.add("Hassae");
        tree.add("James");
        tree.add("Ridae");
        Iterator<String> it = tree.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
}
}