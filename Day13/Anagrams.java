/* Relevant problem links:
    1. https://leetcode.com/problems/group-anagrams/description/
    2. https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
    3. https://www.codechef.com/practice/strings
    4. https://www.geeksforgeeks.org/problems/print-anagrams-together/1
*/

import java.util.ArrayList;

class Anagrams{
    static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }

        for(int j=0; j<s2.length(); j++){
            freq[s2.charAt(j) - 'a']--;
        }

        for(int i=0; i<26; i++){
            if(freq[i] != 0) return false;
        }
        
        return true;
    }

    public static void main(String[] args){
        String[] words = {"ate", "eat", "tea", "rat"};
        boolean[] grouped = new boolean[words.length];
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            if(grouped[i]) continue;

            ArrayList<String> group = new ArrayList<>();
            group.add(words[i]);
            grouped[i] = true;

            for(int j=i+1; j<words.length; j++){
                if(!grouped[j] && isAnagram(words[i], words[j])){
                    group.add(words[j]);
                    grouped[j] = true;
                }
            }
            result.add(group);
        }
        System.out.println(result);
    }
}
