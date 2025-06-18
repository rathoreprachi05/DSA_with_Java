class Record <E, K>{
    E[] arr;

    E get(int i){
        return arr[i];
    }

    K convert(){
        return (K)("Array size is: " + arr.length);
    }

    Record(E[] arr){
        this.arr = arr;
    }

    void print(){
        for(E el : arr){
            System.out.println(el);
        }
    }

    public static <T> void display(T val){
        System.out.println("Value: " + val);
    }
}

class Generics{
    public static void main(String[] args){
        Record<Integer, String> r1 = new Record<>(new Integer[] {1,2,3});
        r1.print();
        System.out.println(r1.convert());

        Record<String, Integer> r2 = new Record<>(new String[] {"Elliee", "num"});
        r2.print();
        System.out.println(r2.convert());

        Record.display("You’re rocking generics!");
    }
}