package org.tbl;

public class SwitchDemo {
    public static void main(String[] args) {
        int switchValue = 5;

        //int,short, byte, char, String, enum
        // Integer, Short, Byte, Character

        switch(switchValue){
            case 4:
                System.out.println("Matched 4");
                break;
            case 5:
                System.out.println("Matched 5");
                break;
        }

        //Check with String
        String switchValStr = "Manali";

        switch(switchValStr){
            case "Ajmer":
                System.out.println("Matched Ajmer");
                break;
            case "Manali":
                System.out.println("Matched Manali");
                break;
            default:
                System.out.println("Start touring India");
        }

        //Checking with Enumerations
        TrafficLight trafficLight = TrafficLight.GREEN;

        switch (trafficLight){
            case RED :
                System.out.println("Light is RED");
                break;
            case YELLOW:
                System.out.println("Light is YELLOW");
                break;
            case GREEN:
                System.out.println("Light is GREEN");
                break;
            default:
                System.out.println("We should not jump the signal");
        }

        int studentClass = 7;
        char studentGrade = 'C';

        if(studentClass == 5){
            if(studentGrade == 'A'){
                System.out.println("Grade 5: Very good result");
            }else if(studentGrade == 'B'){
                System.out.println("Grade 5: Good result");
            }else {
                System.out.println("Grade 5: Needs improvement");
            }
        }else if(studentClass == 6){
            switch (studentGrade){
                case 'A':
                    System.out.println("Grade 6: Very good result");
                    break;
                case 'B':
                    System.out.println("Grade 6: Good result");
                    break;
                default:
                    System.out.println("Grade 6: Needs improvment");
            }
        }else {
            System.out.println("Student doesn't belong to class 5 or 6!");
        }
    }

    private enum TrafficLight {
        RED,
        YELLOW,
        GREEN
    }
}
