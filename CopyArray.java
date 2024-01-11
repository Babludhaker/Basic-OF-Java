public class CopyArray {
    public static void main(String[] args) {
        int a[]  ={2,4,6,8,10,12};

        int arr[] = new int[6];


        for(int i=a.length-1,j=0; i>=0; i--,j++ ) {
            arr[j] = a[i];
        }

        for(int x : arr) {
            System.out.print(x+" ");
        }
    }
    
}
