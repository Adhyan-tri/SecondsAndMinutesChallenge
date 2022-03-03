package com.company;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(7 ,5 );
        if (centimeters<0.0)
        {
            System.out.println("Invalid Parameters");
        }

        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if ( (feet<0)|| ((inches<0) && (inches>12)) )
        {
            return -1;
        }
        double centimeters=(feet*12)*2.54;
        centimeters += inches*2.54;
        System.out.println(feet + "feet " + inches + " inches " + centimeters + "cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if (inches<0)
        {
            return -1;
        }
        double feet = (int) inches/12;
        double remaininginches= (int) inches%12;
        System.out.println(inches + "inches is equal to " + feet + "feet and" + remaininginches + "inches");
        return calcFeetAndInchesToCentimeters(feet,remaininginches);

    }





}
