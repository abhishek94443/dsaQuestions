public class MaxSubArray {
    public static int maxSubArray(int arr[]){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<n;i++){
            for (int j = i; j < n; j++) {
                for (int k = i; k <=j ; k++) {
                    c+=arr[k];
                }
                ans=Math.max(c,ans);
                c=0;
            }


        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        System.out.println( maxSubArray(arr));
    }
}
