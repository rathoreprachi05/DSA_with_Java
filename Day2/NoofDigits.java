public class NoofDigits{
    public int noofdigits(int n){
        int count = 0;
        while(n>=0){
            n /= 10;
            count++;
        }
        return count++;
    }

    public static void main(String[] args){
        NoofDigits obj = new NoofDigits();

        System.out.println(obj.noofdigits(121));
    }
}