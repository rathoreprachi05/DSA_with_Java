import java.util.*;

class ArrayLists{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr.get(3));

        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        
        System.out.println();

        for(int el : arr){
            System.out.print(el + " ");
        }
    }
}