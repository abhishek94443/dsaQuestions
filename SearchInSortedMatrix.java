import java.util.concurrent.BrokenBarrierException;

public class SearchInSortedMatrix {
    public static boolean search(int matrix[][],int key){
        int row=0;int col=matrix[0].length-1;
        while(row< matrix.length&&col>=0){
            if(matrix[row][col]==key){
                System.out.println("your element is found at"+row+" "+col);

                return true;
            }
            else if(matrix[row][col]>key)col--;
            else if(matrix[row][col]<key) row++;
        }
        System.out.println("Element not found!!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1 ,2, 3, 4},
                {5 ,6 ,7, 8},
                {9,10, 11,12},
                {13,14,15,16}
        };
        System.out.println(search(matrix,16));
    }
}
