public class ConvertToZero{
    public int[][] matrix(int[][] mat){
    int[] r = new int[mat.length];
    int[] c = new int[mat[0].length];

    for(int i=0; i<mat.length; i++){
        for (int j=0; j<mat[0].length; j++){
            if(mat[i][j] == 0){
                r[i] = 1;
                c[j] = 1;
            }
        }
    }

    for(int i=0; i<mat.length; i++){
        for(int j=0; j<mat[0].length; j++){
            if(r[i] == 1 || c[j] == 1){
                mat[i][j] = 0;
            }
        }
    }

    return mat;
}


    public static void main(String[] args){
        ConvertToZero m1 = new ConvertToZero();
        int[][] mat = {{1,1,1}, {1,0,1}, {1,1,1}};
        int[][] result = m1.matrix(mat);

        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}