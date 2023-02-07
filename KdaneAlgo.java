public class KdaneAlgo {
    public static int kdane(int arr[]){
        int max=Integer.MIN_VALUE;
        int csum=0;
        for(int i=0;i<arr.length;i++){
            csum+=arr[i];
            if(csum<0){

                csum=0;
            }
            max=Math.max(max,csum);

        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.println( kdane(arr));
    }
}
