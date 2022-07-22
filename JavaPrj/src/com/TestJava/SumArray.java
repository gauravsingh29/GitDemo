package com.TestJava;

public class SumArray {
    public static void main(String a[]){
        int c[] = {1,2,5,8,99,8,8,90};
        int temp=0;
        int sum=0;
        for(int aa : c){
            temp = temp+aa;
        }

        for(int j=0; j<=c.length-1;j++){
            sum = sum + c[j];
        }
        System.out.println(temp +" ===== " + sum);

        //Print index of 8 and also how many times
        int num =8;
        int counter = 0;
        for(int j=0; j<=c.length-1;j++){
            if(c[j]==num){
                counter++;
            }
        }
        System.out.println(counter);

        //Multi dimensional arrays
        int g[][] = {{2,3,4},{9,3,6},{3,5,4}};
        System.out.println("Matrix");
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(i==j){
                    System.out.println(g[i][j]);
                }
            }
        }

        //Min Number and Max
        System.out.println("Min matrix");
        int q[][]={{2,3,6}, {8,1,2}};
        int temp1=q[0][0];
        for(int i=0;i<q.length;i++){
            for(int j=0;j<q[0].length;j++){
                if(q[i][j]<temp1){
                    temp1=q[i][j];
                }
            }
        }
        System.out.println(temp1);

    System.out.println("Max matrix");
    int temp2=q[0][0];
        for(int i=0;i<q.length;i++){
        for(int j=0;j<q[0].length;j++){
            if(q[i][j]>temp2){
                temp2=q[i][j];
            }
        }
    }
        System.out.println(temp2);
}
}
