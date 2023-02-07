import java.util.Scanner;
class Main {
    public static long factorial(long n){
        if(n==0||n==1)return 1;
        else  return  n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the simple math helper.");
        System.out.println("What would you like to calculate?");
        System.out.println("1. Sqrt \n2. Log \n3. Factorial");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        if(c==1){
            System.out.println("Enter Number to Sqrt");
            long n=sc.nextLong();
            System.out.println(Math.sqrt(n));
        }
        else if(c==2){
            System.out.println("Enter Number to Log");
            long n=sc.nextLong();
            System.out.println(Math.log(n));

        }
        else if(c==3){
            System.out.println("Enter Number to Factorial");
            long n=sc.nextLong();
            System.out.println(factorial(n));
        }
    }
}
