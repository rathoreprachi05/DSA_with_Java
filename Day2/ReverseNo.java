public class ReverseNo{
    // Iteratively
    public int reverseno(int n){
        int rev = 0;
        while(n>0){
            rev = (rev*10) + (n%10);
            n = n/10;
        }
        return rev;
    }

    public int revnorec(int n, int rev){
        if(n == 0) return rev;
        rev = (rev*10) + (n%10);
        return revnorec(n/10, rev);
    }
    
    public static void main(String[] args){
        ReverseNo obj = new ReverseNo();

        System.out.println(obj.reverseno(1234));
        System.out.println(obj.revnorec(2346, 0));
    }
}