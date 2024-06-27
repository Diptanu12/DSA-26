public class orderAgnosticBN {
    public static void main(String[] args) {
       // int arr[]={2,5,6,8,9,12,14,15,36,45,56};
        int arr[]={56,45,35,25,15,5,1};
        System.out.println(orderAgBN(arr, 35));
    }

    static int orderAgBN(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whetger array is sorted asc or desc
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            //find mid
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }

        }
        return -1;

    }
}
