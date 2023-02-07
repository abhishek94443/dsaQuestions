public class PrefixSum {
    public static int maxSubArray(int arr[]) {
        int n = arr.length;
        int sum[] = new int[n];
        int currSum = 0;
        sum[0]=arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = arr[i] + sum[i - 1];
        }
int max=0;
        for (int i = 0; i < n; i++) {
            currSum=0;
            for (int j = i; j < n; j++) {
                currSum = i==0?sum[j]:sum[j] - sum[i - 1];

            }
            max=Math.max(currSum,max);
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.println( maxSubArray(arr));
    }
}
