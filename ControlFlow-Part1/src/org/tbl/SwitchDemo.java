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
    }

    private enum TrafficLight {
        RED,
        YELLOW,
        GREEN
    }
}
