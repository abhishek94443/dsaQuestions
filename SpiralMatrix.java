public class SpiralMatrix {
    public static void spiralM(int m[][]){
        int startRow=0;
        int startCol=0;
        int endCol=m[0].length-1;
        int endrow=m.length-1;
        while(startCol<=endCol && startRow<=endrow){
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(m[startRow][i]+" ");
            }
            for (int i = startRow+1; i <= endrow; i++) {
                System.out.print(m[i][endCol]+" ");

            }
            for (int i = endCol-1; i >=startCol ; i--) {
                if(startRow==endrow)break;
                System.out.print(m[endrow][i]+" ");

            }
            for (int i = endrow-1 ; i >=startRow+1 ; i--) {
                if(startCol==endCol)break;
                System.out.print(m[i][startCol]+" ");

            }
            startCol++;
            startRow++;
            endrow--;
            endCol--;
        }


    }
    public static void main(String[] args) {
int m[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16},
        {17,18,19,20},
         };

spiralM(m);



    }
}
