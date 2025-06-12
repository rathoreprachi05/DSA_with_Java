public class Fibo{
    // Iteratively
    public int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int n1, n2, n3;
        n1 = 0;
        n2 = 1;
        for(int i=2; i<=n; i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }

    // Recursively
    public int fiborec(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        
        return fiborec(n-1) + fiborec(n-2); 
    }

    public static void main(String[] args){
        Fibo obj = new Fibo();

        for(int i=0; i<=5; i++){
            System.out.print(obj.fibo(i) + " ");
        }
        System.out.print("\n");
        for(int i=0; i<=5; i++){
            System.out.print(obj.fiborec(i) + " ");
        }

    }
}