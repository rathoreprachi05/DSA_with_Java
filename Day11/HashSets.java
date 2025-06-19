import java.util.HashSet;
import java.util.Iterator;

class HashSets{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(3);

        System.out.println(hs.size());
        System.out.println(hs);

        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}