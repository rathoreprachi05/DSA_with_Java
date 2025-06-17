public class MoveZeroesWithoutExtraSpace{
    public int[] movezeroes(int[] arr){
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        for(; j<arr.length; j++){
            arr[j] = 0;
        }

        return arr;
    }

    public static void main(String[] args){
        MoveZeroesWithoutExtraSpace a1 = new  MoveZeroesWithoutExtraSpace();

        int[] input = {0, 1, 0, 3, 12};
        int[] output = a1.movezeroes(input);

        for(int i=0; i<output.length; i++){
            System.out.print(output[i] + " ");
        }
    }
}