public class Strings{
    public static void main(String[] args){
        String str = "Prachi";
        String str2 = "PrachiRathore";
        String str3 = "prachirathore";
        String str4 = new String("Prachi");

        System.out.println(str == str2);
        System.out.println(str == str4);

        if(str.equalsIgnoreCase(str4)){
            System.out.println("Strings are equal");
        }

        if(str.equals(str2)){
            System.out.println("Strings are equal");
        }
        else System.out.println("Strings are not equal.");

        if(str2.equalsIgnoreCase(str3)){
            System.out.println("Strings are equal");
        }
        else System.out.println("Strings are not equal.");
    }
}