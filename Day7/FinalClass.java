final class Car{
    void drive(){
        System.out.println("Car is driving");
    }
}

class FinalClass{
    public static void main(String[] args){
        Car c1 = new Car();
        c1.drive();
    }
}