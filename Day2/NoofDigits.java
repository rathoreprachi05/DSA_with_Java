public class NoofDigits{

    // Iteratively
    public int noofdigits(int n){
        int count = 0;
        if(n == 0) return 1;
        while(n>0){
            n /= 10;
            count++;
        }
        return count;
    }

    // recursively
    public int noofdigitsrec(int n){
        if(n >=0 && n <= 9) return 1;
        return (1 + noofdigitsrec(n/10));
    }

    public static void main(String[] args){
        NoofDigits obj = new NoofDigits();

        System.out.println(obj.noofdigits(121));
        System.out.println(obj.noofdigitsrec(1217));
    }
}