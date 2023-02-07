public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
               if(arr[j]>arr[index])index=j;
//                if(arr[j]>arr[j+1]){

//                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,24,43,2};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
