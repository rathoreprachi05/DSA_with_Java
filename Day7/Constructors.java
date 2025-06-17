class Student{
    String name;
    int age;

    Student (){
        System.out.println("Default constructor called!");
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
}

class Constructors{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Elliee";
        s1.age = 19;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        Student s2 = new Student("Prachi", 19);
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);

        Student s3 = new Student(s2);
        System.out.println("Copied Student's Name: " + s3.name);
        System.out.println("Copied Student's Age: " + s3.age);

    }
}