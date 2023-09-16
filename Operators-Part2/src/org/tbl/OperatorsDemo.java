package org.tbl;

public class OperatorsDemo {
    public static void main(String[] args) {
        //Arithmetic operators
        //Addition
        int num1 = 12;
        int num2 = 15;
        int output = num1 + num2;
        System.out.println(output);

        //Subtraction
        int num3 = 20;
        int num4 = 10;
        int output2 = num3 - num4;
        System.out.println(output2);

        //Multiplication
        int num5 = 5;
        int num6 = 6;
        int output3 = num5 * num6;
        System.out.println(output3);

        //Division
        int num7 = 40;
        int num8 = 7;
        int output4 = num7 / num8;
        System.out.println(output4);

        double dnum7 = 15.5;
        double dnum8 = 3;
        double output5 = dnum7 / dnum8;
        System.out.println(output5);

        //Modulo operator
        int numx = 13;
        int numy = 5;
        int output6 = numx % numy;
        System.out.println(output6);

        //Relational operator
        int nump = 10;
        int numq = 11;

        if(nump != numq){
            System.out.println("nump is not same as numq");
        }else{
            System.out.println("nump is same as numq");
        }

        int finalValue = (nump >= numq)?100:120;
        System.out.println(finalValue);
    }
}