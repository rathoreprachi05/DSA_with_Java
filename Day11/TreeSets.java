import java.util.Iterator;
import java.util.TreeSet;

class TreeSets{
    public static void main(String[] args){
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(2);
        ts.add(4);

        System.out.println(ts.size());
        System.out.println(ts);

        Iterator<Integer> it = ts.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(Integer el : ts){
            System.out.println(el);
        }
    }
}