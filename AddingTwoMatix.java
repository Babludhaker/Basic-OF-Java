public class AddingTwoMatix {
    public static void main(String[] args) {
        int mat1[][] = {{3,6,9},{7,3,5},{4,3,5}};
        int mat2[][] = {{1,5,3},{6,5,3},{2,5,7}};

        int mat[][] = new int[3][3];

        for(int i=0; i<mat1.length; i++) {
            for(int j=0; j<mat1[0].length; j++) {
                mat[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for(int x[] : mat) {
            for(int y: x) {
            System.out.print(y+" ");
        }
        System.out.println();
    }
    }
    
}
