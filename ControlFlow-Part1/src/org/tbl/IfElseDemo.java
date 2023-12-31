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

        int studentClass = 7;
        char studentGrade = 'C';

        if(studentClass == 5 && studentGrade == 'A'){
            System.out.println("Grade 5: Very good result");
        }else if(studentClass == 5 && studentGrade == 'B'){
            System.out.println("Grade 5: Good result");
        }else if(studentClass == 5 && (studentGrade != 'A' && studentGrade != 'B')){
            System.out.println("Grade 5: Needs improvement");
        }else if(studentClass == 6 && studentGrade == 'A'){
            System.out.println("Grade 6: Very good result");
        }else if(studentClass == 6 && studentGrade == 'B'){
            System.out.println("Grade 6: Good result");
        }else if(studentClass == 6 && (studentGrade != 'A' && studentGrade != 'B')){
            System.out.println("Grade 6: Needs improvement");
        }else if(studentClass != 5 && studentClass != 6){
            System.out.println("Student doesn't belong to class 5 or 6");
        }

        if(studentClass == 5){
            if(studentGrade == 'A'){
                System.out.println("Grade 5: Very good result");
            }else if(studentGrade == 'B'){
                System.out.println("Grade 5: Good result");
            }else {
                System.out.println("Grade 5: Needs improvement");
            }
        }else if(studentClass == 6){
            if(studentGrade == 'A'){
                System.out.println("Grade 6: Very good result");
            }else if(studentGrade == 'B'){
                System.out.println("Grade 6: Good result");
            }else {
                System.out.println("Grade 6: Needs improvement");
            }
        } else {
            System.out.println("Student doesn't belong to class 5 or 6");
        }
    }
}
