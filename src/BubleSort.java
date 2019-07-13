public class BubleSort {

    public static void main(String[] args){

        int[] arr = {5,23,3,7,10,1};
        int[] newArr = bubleSort(arr);
        // print result
        System.out.print("Result  : ");
        for (int a: newArr)
            System.out.print(a+" ");
    }

    static int[] bubleSort(int[] arr){
        int n = arr.length - 1;
        // loop for sorting
        for (int i=0; i<n; i++){
            // sorting process
            for (int j=0; j<n-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            // see the step
            System.out.print("Step-"+ (i+1) +": ");
            for (int a: arr)
                System.out.print(a+" ");
            System.out.println();
        }
        return arr;
    }

}
