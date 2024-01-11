public class First {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8};
        int key = 7;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]==key) {
                System.out.println("The key is Available"+i);
                System.exit(0);
            }
        }
        System.out.println();
    }
}
