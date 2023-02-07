import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int max=0;
            int first=sc.nextInt();
            for(int i=1;i<n;i++){
                int num=sc.nextInt();
                max=Math.max(max,num+first);
                first=num;

            }
            System.out.println(max);
        }
    }
}
