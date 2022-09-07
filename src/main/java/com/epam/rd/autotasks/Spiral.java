package com.epam.rd.autotasks;
class Spiral {
    static int[][] spiral(int rows, int columns) {
        // return null;
        int [][] tesr= new int [rows][columns];
        int startrows = 0;
        int endrows = rows-1;
        int startCol=0;
        int endCol=columns-1;
        int k=1;
        while (startrows<=endrows && startCol<=endCol ) {
            for (int i=startCol;i<=endCol;++i) {
                tesr [startrows] [i]=k;
                ++k;
            }
           startrows++;
            for (int j=startrows; j<=endrows;++j) {
                tesr [j][endCol]=k;
                ++k;
            }
            endCol--;
            if (startrows>endrows) {
                break;
            }
            for (int g=endCol;g>=startCol;g--){
                tesr [endrows] [g]=k;
                k++;
            }
               endrows--;
            for (int h=endrows;h>=startrows;h--){
                tesr[h][startCol]=k;
                k++;
            }
            startCol++;
        }
return tesr;
    }



    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(3, 4);
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }
}