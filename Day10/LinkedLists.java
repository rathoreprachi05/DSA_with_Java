import java.util.LinkedList;
import java.util.Iterator;

class LinkedLists{
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<>();
        names.add("Mangoo");
        names.add("Sammmyy");
        names.addFirst("Esra");
        names.addLast("Evrin");

        System.out.println(names);

        names.removeFirst();
        System.out.println(names);

        String n = names.getFirst();
        System.out.println(n);

        Iterator<String> it = names.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
