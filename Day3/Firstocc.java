public class Firstocc{
    public int firstocc(String s, char ch){
        int index = 0;
        for (char c : s.toCharArray()){
            if(c == ch) return index;
            index++;
        }
        return -1;
    }

    public int firstoccrec(String s, char ch, int i){
        if(s.charAt(i) == ch) return i;
        if(i>s.length()) return -1;
        return firstoccrec(s, ch, i+1);
    }

    public static void main(String[] args){
        Firstocc obj = new Firstocc();
        System.out.println(obj.firstocc("abcdes", 's'));
        System.out.println(obj.firstoccrec("abcdes", 's', 0));
    }
}