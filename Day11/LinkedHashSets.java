import java.util.Iterator;
import java.util.LinkedHashSet;

class LinkedHashSets{
    public static void main(String[] args){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(1);
        lhs.add(2);
        lhs.add(2);
        lhs.add(3);
        lhs.add(3);
        lhs.add(4);

        System.out.println(lhs.size());
        System.out.println(lhs);

        Iterator<Integer> it = lhs.iterator();

        for(Integer el : lhs){
            System.out.println(el);
        }

        while(it.hasNext()){
            System.err.println(it.next());
        }
    }
}