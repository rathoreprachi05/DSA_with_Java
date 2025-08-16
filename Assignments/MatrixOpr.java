public class MatrixOpr {
    int[][] arr;

    MatrixOpr(int[][] input){
        arr = input;
    }

    void display(){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    MatrixOpr add(MatrixOpr other) {
    int[][] result = new int[arr.length][arr[0].length];
    
    for(int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            result[i][j] = this.arr[i][j] + other.arr[i][j];
        }
    }
    
    return new MatrixOpr(result);
}

MatrixOpr multiply(MatrixOpr other) {
    int[][] result = new int[arr.length][other.arr[0].length];

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < other.arr[0].length; j++) {
            for (int k = 0; k < arr[0].length; k++) {
                result[i][j] += arr[i][k] * other.arr[k][j];
            }
        }
    }

    return new MatrixOpr(result);
}


public static void main(String[] args){
    int[][] M1 = {{1,2}, {3, 4}};
    int[][] M2 = {{5,6}, {7,8}};

    MatrixOpr m1 = new MatrixOpr(M1);
    MatrixOpr m2 = new MatrixOpr(M2);

    MatrixOpr sum = m1.add(m2);
    System.out.println("Sum of matrices:");
    sum.display();

    MatrixOpr product = m1.multiply(m2);
    System.out.println("Product of matrices:");
    product.display();
}
}


