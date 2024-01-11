import javax.sound.sampled.SourceDataLine;

public class TwoDeminsionalArray {
    public static void main(String[] args) {
        int arr[][] = {{2,3,4,5},{2,6,8,5},{2,67,73,63}};


        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(arr[1][2]);
    }

    
}
