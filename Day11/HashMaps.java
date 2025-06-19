import java.util.HashMap;

class HashMaps{
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Mango", 10);
        hm.put("Sammmyyyyy", 100);
        hm.put("Elliee", 10);

        System.out.println(hm.get("Mango"));
        System.out.println(hm.containsKey("Elliee"));

        for(String key : hm.keySet()){
            System.out.println("The key is " + key + ", the value is " + hm.get(key));
        }
    }
}