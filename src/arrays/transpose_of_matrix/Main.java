package arrays.transpose_of_matrix;

public class Main {
    public static void transpose(int[][] matris){
        int[][] transpoz=new int[matris[0].length][matris.length];

        for(int i=0;i< matris.length;i++){
            for(int j=0;j<matris[0].length;j++){
                transpoz[j][i]= matris[i][j];
            }
        }

        for (int[] satır : transpoz){
            for(int sütun : satır){
                System.out.print(sütun+" ");
            }
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
        };

        transpose(matrix);

    }
}
