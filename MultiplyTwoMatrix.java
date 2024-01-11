import java.util.Arrays;

public class MultiplyTwoMatrix {
    public static void main(String[] args) {
        int mat1[][] = {{2,4},{6,7}};
        int mat2[][] = {{3,2},{1,7}};

        int mat[][] = new int[2][2];

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat1.length; j++) {
                for(int k=0; k<mat.length; k++) {
                    mat[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }


        for(int x[] : mat) {
            for(int y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        Arrays.sort(mat);

    }
    
}
