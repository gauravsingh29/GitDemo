package com.TestJava;

public class Matrix {
    public static void main(String a[]){
        int q[][] = {{1,3,6},{2,0,3}};
        int mincol=0;
        int minNum=q[0][0];
        for(int i=0;i< q.length;i++){
            for(int j=0;j<q[0].length;j++){
                if(q[i][j]<minNum){
                    minNum=q[i][j];
                    mincol=j;
                }
            }
        }

        System.out.println("Col number is = "+mincol);
int minColVal=q[0][mincol];
        for(int p=0;p< q.length;p++){
                if(q[p][mincol]<minColVal){
                    minColVal=q[p][mincol];

            }
        }
        System.out.println("Expected value is = "+minColVal);
    }
}
