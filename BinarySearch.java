public class BinarySearch {
    public static int binarySearch(int arr [],int key){
        int s=0;
        int e=arr.length;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==key){
                return mid+1;
            }
            else if(arr[mid]>key){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println( binarySearch(arr,3));
    }
}
