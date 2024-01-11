public class SecondLargest {

    //Function For Find Second Largest Element in array
    static int Second(int n, int arr[]) {
        int largest = Integer.MIN_VALUE;
        int Second = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
            if(arr[i]>largest) {
                Second = largest;
                largest = arr[i];
            } else if(arr[i]> Second && arr[i] != largest) {
                Second = arr[i];
            }
        }
        return   Second ==Integer.MIN_VALUE?-1:Second;
        }

    public static void main(String[] args) {
        int arr[] = {5, 9, 9, 8, 6, 8};
        // int arr[] = {12,35,1,10,34,1};
        System.out.println(Second(arr.length, arr));
    }
        }

