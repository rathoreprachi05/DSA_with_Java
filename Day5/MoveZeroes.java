public class MoveZeroes{
    public int[] movezeroes(int[] arr){
        int[] newArray = new int[arr.length];

        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                newArray[j] = arr[i];
                j++;
            }
        }
        return newArray;
    }

    public static void main(String[] args){
        MoveZeroes a1 = new MoveZeroes();

        int[] input = {0, 1, 0, 3, 12};
        int[] output = a1.movezeroes(input);

        for(int i=0; i<output.length; i++){
            System.out.print(output[i] + " ");
        }
    }
}