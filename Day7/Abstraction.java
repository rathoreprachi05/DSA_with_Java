abstract class Animal{
    private int noOfLegs;

    Animal(int noOfLegs){
        this.noOfLegs = noOfLegs;
    }

    abstract void speak();

    int getLegs(){
        return noOfLegs;
    }
}

class Dog extends Animal{
    void speak(){
        System.out.println("Woof!");
    }

    Dog(int noOfLegs){
        super(noOfLegs);
    }
}

public class Abstraction{
    public static void main(String[] args){
        Dog d1 = new Dog(4);
        
        d1.speak();
        System.out.println(d1.getLegs());
    }
}