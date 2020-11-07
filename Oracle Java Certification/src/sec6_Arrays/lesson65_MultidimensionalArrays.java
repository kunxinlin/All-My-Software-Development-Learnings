package sec6_Arrays;

import java.util.Arrays;

public class lesson65_MultidimensionalArrays {
    public static void main(String[] args) {

        //asymmetric 2d array
        String[][] arr2d = new String[][]{
                {"1"},
                {"1", "2"},
                {"1", "2", "3"}
        };

        //plane, row, col
        int[][][] array3d = new int [2][2][3];
        //System.out.println(Arrays.toString(Arrays.toString(arr2d)));

        print2d(arr2d);
        print2dv2(arr2d);
        print2dv3(arr2d);
    }

    private static void print2d(String[][] array2d){
        for (int i = 0; i < array2d.length; i++){
            for (int j = 0; j < array2d[i].length; j++){
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void print2dv2(String[][] array2d){
        for (var i: array2d){
            for (var j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void print2dv3(String[][] array2d){
        for (var i: array2d){
            System.out.println(Arrays.toString(i));
        }
    }
}
