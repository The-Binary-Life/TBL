package org.tbl;

public class IfElseDemo {
    public static void main(String[] args) {
        int numberOne = 15;
        int numberTwo = 20;
        int numberThree = 11;

        //how if condition works
//        if(numberOne > numberTwo){
//            System.out.println(numberOne + " is greater than " + numberTwo);
//        }
//
//        if(numberOne < numberTwo){
//            System.out.println(numberOne + " is less than " + numberTwo);
//        }

        //how to combine both the above statements using else
//        if(numberOne > numberTwo){
//            System.out.println(numberOne + " is greater than " + numberTwo);
//        } else {
//            System.out.println(numberOne + " is less than " + numberTwo);
//        }

        //how to create the else-if ladder
        if(numberOne < numberThree){
            System.out.println(numberOne + " is less than " + numberThree);
        }else if(numberOne < numberTwo){
            System.out.println(numberOne + " is less than " + numberTwo);
        }else {
            System.out.println(numberOne + " is greater than " + numberTwo + " and " + numberThree);
        }

        //how to work with strings in an else-if ladder
        String myCompany = "wipro";
        if(myCompany == "TCS"){
            System.out.println("Company is TCS");
        }else if (myCompany == "Cognizant"){
            System.out.println("Company is cognizant");
        }else if(myCompany == "wipro"){
            System.out.println("Company is wipro");
        }else {
            System.out.println("company not found");
        }
    }
}
