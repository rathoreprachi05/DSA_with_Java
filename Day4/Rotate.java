public class Rotate{
    public int[] rotateby1(int[] arr){
        int last = arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        return arr;
    }

    public int[] rotatebyr(int[] arr, int r){
        int[] rotated = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int newIndex = (i+r) % arr.length; 
            rotated[newIndex] = arr[i];
        }
        return rotated;
    }

    public static void main(String[] args) {
       Rotate a1 = new Rotate();
       int[] rotated = a1.rotateby1(new int[]{1, 2, 3, 4, 5});

       for (int num : rotated) {
       System.out.print(num + " ");
        }

        System.out.println(); 

        int[] rotatedByR = a1.rotatebyr(new int[]{1, 2, 3, 4, 5}, 3);
        for (int num : rotatedByR) {
            System.out.print(num + " ");
        }

    }
}

