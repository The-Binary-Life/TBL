package org.tbl;
public class OperatorsDemo {
    public static void main(String[] args) {
        //Assignment Operator
        int val1;
        val1 = 10 + 5;
        System.out.println(val1);

        //Negation Operator
        int val2;
        val2 = 10;
        val2 = -val2;
        System.out.println(val2);
        val2 = -val2;
        System.out.println(val2);

        //Complement Operator
        boolean val3 = false;
        val3 = !val3;
        System.out.println(val3);
        val3 = !val3;
        System.out.println(val3);

        //Prefix operator
        int val4 = 10;
        //val4 = val4 + 1;
        ++val4;
        System.out.println(val4);
        //val4 = val4 - 1;
        --val4;
        System.out.println(val4);

        //Postfix operator
        int val5 = 15;
        //val5 = val5 - 1
        val5++;
        System.out.println(val5);
        //val5 = val5 - 1
        val5--;
        System.out.println(val5);

        int val6 = 15;
        int output = val6++;
        System.out.println(output);
        System.out.println(val6);

        int val7 = 20;
        int output2 = val7--;
        System.out.println(output2);
        System.out.println(val7);
    }
}
