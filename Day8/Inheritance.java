class Animal{
    void speak(){
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Dog barks");
    }
}

class Inheritance{
    public static void main(String[] args){
        Animal d = new Dog();
        d.speak();
    }
}