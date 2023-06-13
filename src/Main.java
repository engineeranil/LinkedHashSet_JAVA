import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhSet = new LinkedHashSet<>();
        lhSet.add(50);
        lhSet.add(20);
        lhSet.add(30);
        

        Iterator<Integer> ıtr = lhSet.iterator();
        while(ıtr.hasNext()){
            System.out.println(ıtr.next());
        }
    }
}
