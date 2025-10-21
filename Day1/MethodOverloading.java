public class MethodOverloading{
    int max(int a, int b){
        return a>b?a:b;
    }
    
    // Method Overloading
    int max(int a, int b, int c){
        return max(a, max(b,c));
    }

    int max(int a, int b, int c, int d){
        return max(a, max(b, max(c, d)));
    }

    // Varargs
     
    int max(int...num){
        int currentmax = 0;
        for(int i=0; i<num.length; i++){
            if(num[i]>currentmax){
                currentmax = num[i];
            }
        }
        return currentmax;
    }

    int min(int... num){
        int currentmin = num[0];
        for(int i=1; i<num.length; i++){
            if(num[i]<currentmin){
                currentmin = num[i];
            }
        }

        return currentmin;
    }

    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.max(10,5,20,19,27,30)); 
        System.out.println(obj.min(11,12,13,6,15,16));      
    }
}

 
