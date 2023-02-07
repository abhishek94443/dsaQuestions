public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int c=0;
//        solution 1
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(i==j||(i+j)==n-1){
//                    c=c+matrix[i][j];
//                }
//            }
//        }
//         solution 2
        for (int i = 0; i < n; i++) {
            c+=matrix[i][i];
            if(i!=n-1-i){
                c+=matrix[i][n-1-i];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int m[][]={{1 ,2, 3, 4},
                   {5 ,6 ,7, 8},
                   {9,10, 11,12},
                   {13,14,15,16}
        };
        System.out.println(diagonalSum(m));
    }
}
