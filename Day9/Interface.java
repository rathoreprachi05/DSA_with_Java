interface Mammal{
    void habitate();
    void speak();
}

@FunctionalInterface
interface Animal{
    void speak();
}

class Dog implements Mammal, Animal{
    public void speak(){
        System.out.println("Dog Barks!");
    }

    public void habitate(){
        System.out.println("Lives at home");
    }
}

class Cat implements Animal{
    public void speak(){
        System.out.println("Cat meows!");
    }
}

class Interface{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.speak();
        d1.habitate();

        Cat c1 = new Cat();
        c1.speak();

        Animal a1 = () -> System.out.println("I'm from a lambda!");
        a1.speak();

        Mammal m1 = new Mammal(){
            public void speak(){
                System.out.println("Anonymous speak!");
            }

            public void habitate(){
                System.out.println("Anonymous habitate");
            }
        };
        m1.speak();
        m1.habitate();
    }
}