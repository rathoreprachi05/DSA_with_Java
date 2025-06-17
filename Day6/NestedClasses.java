class Outer1{
    int x = 10;

    class Inner1{
        void show(){
            x++;
            System.out.println(x);
        }
    }
}

class Outer2{
    static int x = 100;

    static class Inner2{
        void show(){
            x++;
            System.out.println(x);
        }
    }
}

class NestedClasses{
    public static void main(String[] args){
        Outer1 obj1 = new Outer1();
        Outer1.Inner1 inner = obj1.new Inner1();
        inner.show();

        Outer2.Inner2 obj2 = new Outer2.Inner2();
        obj2.show();
    }
}