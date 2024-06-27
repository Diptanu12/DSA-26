public class BNSearch {
    public static void main(String[] args) {
int arr[]={2,5,6,8,9,12,14,15,36,45,56};
        System.out.println(binarySearch(arr, 415));
    }

    static int binarySearch(int arr[], int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find mid
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //answer found
                return mid;
            }
        }
        return -1;
    }
}
