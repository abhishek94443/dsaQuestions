import java.util.Scanner;

class Solution {


    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        boolean col=true;
        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0)col=false;
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0)matrix[i][0]=matrix[0][j]=0;
            }
        }

        for(int i= rows-1;i>=0;i--){
            for (int j=cols-1;j>=1;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
                if(col==false)matrix[i][0]=0;
            }
        }
    }
}
public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
     int arr[][]=new int [n][m];
     for(int i=0;i<n;i++){
         for (int j=0;j<m;j++){
             arr[i][j]=sc.nextInt();
         }
     }
     Solution s=new Solution();

     s.setZeroes(arr);
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
