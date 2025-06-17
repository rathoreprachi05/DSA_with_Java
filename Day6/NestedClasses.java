class Outer1{
    int x = 10;

    class Inner1{
        void show(){
            x++;
            System.out.println(x);
        }
    }
}

class NestedClasses{
    public static void main(String[] args){
        Outer1 obj = new Outer1();
        Outer1.Inner1 inner = obj.new Inner1();
        inner.show();
    }
}