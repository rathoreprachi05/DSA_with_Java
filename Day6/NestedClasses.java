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

class Outer3{
    void check(){
        class LocalInner{
            void display(){
                System.out.println("Hello from local inner class!");
            }
        }
        LocalInner obj = new LocalInner();
        obj.display();
    }
}

class NestedClasses{
    public static void main(String[] args){
        Outer1 obj1 = new Outer1();
        Outer1.Inner1 inner = obj1.new Inner1();
        inner.show();

        Outer2.Inner2 obj2 = new Outer2.Inner2();
        obj2.show();

        Outer3 obj3 = new Outer3();
        obj3.check();
    }
}