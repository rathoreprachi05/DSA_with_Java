import java.util.*;

class GroupAnagramsOptimized{
    public static void main(String[] args){
        String[] words = {"ate", "eat", "tea", "rat"};
        
        HashMap<String, ArrayList<String>> map = new HashMap<>(); 

        for(String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(map.containsKey(key)){
                map.get(key).add(word);
            }
            else{
                ArrayList<String> group = new ArrayList<>();
                group.add(word);
                map.put(key, group);
            }
        }
        System.out.println(map.values());
    }
}
