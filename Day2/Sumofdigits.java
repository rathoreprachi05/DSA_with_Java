public class Sumofdigits{
    // Iteratively
    public int sumofdigits(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    // Recursively
    public int sumofdigitsrec(int n){
        if(n<=0) return 0;
        else return n%10 + sumofdigitsrec(n/10); 
    }

    public static void main(String[] args){
        Sumofdigits obj = new Sumofdigits();

        System.out.println(obj.sumofdigits(121));
        System.out.println(obj.sumofdigitsrec(455));
    }
}