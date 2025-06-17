class Dog{
    static int dogCount=0;
    String name;

    Dog(String name){
        this.name = name;
        dogCount++;
    }

    void bark(){
        System.out.println("Woof!, I am " + name);
    }

    public static void main(String[] args){
        Dog Bruno = new Dog("Bruno");
        Bruno.bark();

        Dog Scooby = new Dog("Scooby");
        Scooby.bark();

        System.out.println("Total dogs: " + Dog.dogCount);
    }
}