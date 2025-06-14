public class Firstocc{
    public int firstocc(String s, char ch){
        int index = 0;
        for (char c : s.toCharArray()){
            if(c == ch) return index;
            index++;
        }
        return -1;
    }

    private static int firstOccuranceRec(String str,char ch,int i){
        if(i >= str.length())return -1;
        if(str.charAt(i) == ch)return i;
        return firstOccuranceRec(str, ch, i+1);
    }

    public static void main(String[] args){
        Firstocc obj = new Firstocc();
        System.out.print(obj.firstocc("abcdes", 's'));

        String str = "abcabcaaacc";
        System.out.println(firstOccuranceRec(str,'c',0));
    }
}