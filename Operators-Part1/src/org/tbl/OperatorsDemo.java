package org.tbl;
public class OperatorsDemo {
    public static void main(String[] args) {
        //Assignment operator
        int val1;
        val1 = 10;
        System.out.println(val1);

        //Negation Operator
        int val2;
        val2 = -10;
        val2 = -val2;
        System.out.println(val2);

        //Complement Operator
        boolean val3;
        val3 = false;
        val3 = !val3;
        System.out.println(val3);

        //++, -- Prefix operators
        int val4 = 10;
        //val4 = val4 + 1;
        ++val4;
        System.out.println(val4);
        //val4 = val4 - 1;
        --val4;
        System.out.println(val4);

        //Postfix operators ++, --
        int val5 = 5;
        //int val6 = val5;
        //val5 = val5 + 1;
        int val6 = val5++;
        System.out.println("val5 = " + val5 + " val6 = " + val6);

        //int val7 = val5;
        //val5 = val5 - 1;
        int val7 = val5--;
        System.out.println("val7 = " + val7 + " val5 = " + val5) ;
    }
}
