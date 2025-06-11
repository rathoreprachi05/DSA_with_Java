public class Fact{
    // Iteratively

    public int fact(int n){
        int f = 1;
        while(n>0){
            f *= n;
            n--;
        }
        return f;
    }

    // Recursively
    public int factrec(int n){
        if(n == 0) return 1;
        return n*factrec(n-1);
    }

    public static void main(String[] args){
        Fact obj = new Fact();

        System.out.println(obj.fact(5));
        System.out.println(obj.factrec(6));
    }
}