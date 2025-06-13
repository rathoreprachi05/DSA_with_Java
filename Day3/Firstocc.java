public class Firstocc{
    public int firstocc(String s, char ch){
        int index = 0;
        for (char c : s.toCharArray()){
            if(c == ch) return index;
            index++;
        }
        return -1;
    }

    public int firstoccrec(String s, char ch){
        if(s.isEmpty()) return -1;
        if(s.charAt(0) == ch) return 0;
        
        
    }

    public static void main(String[] args){
        Firstocc obj = new Firstocc();

        System.out.print(obj.firstocc("abcdes", 's'));
    }
}