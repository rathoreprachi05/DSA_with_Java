class Poly{
    int max(int a, int b){
        return Math.max(a,b);
    }

    int max(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
}

class Polymorphism{
    public static void main(String[] args){
        Poly p1 = new Poly();

        System.out.println(p1.max(45,40));
        System.out.println(p1.max(10,20,30));
    }
}