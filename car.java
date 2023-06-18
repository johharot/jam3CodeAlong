//in java we don't use let, var, const to call out. We have to define the type

import java.math.BigDecimal;
import java.math.RoundingMode;

public class car {
    // non-primitive and non-static( so we have to create an object to make is
    // useable )

    public car(String color) {
        ;
        this.color = color;

    }

    String color = new String("Yellow");

    // primitive
    boolean isThisCarAConvertible = true;
    byte driverAge = 125;// it can only hold 3 digits, a byte is a 8 bits, fixed decimal point
    short makeYear = 1999;// it can hold 5 digits, fixed decimal point
    // these hold big values so we have to make sure that our code is efficient
    int i1actualMilesDrivenByMe = 100000;
    long milage = 200000;

    char character = 'a';// extract only 1 character out of the data type
    float fP = 10.20f;// 32bit, a movable decimal point
    double carPrice = 20000.2043434;// 64 bit, a movable decimal point

    public static void main(String args[]) {
        car myFirstCar = new car("White");// we created a new object class to refer to the String as it's non-primitive
        // myFirstCar.color = myFirstCar.color.concat("and white")

        // System.out.println("The color of my car is " + myFirstCar.color + " and the
        // amount of letter in the color is: " + myFirstCar.color.length());
        System.out.println("current double " + myFirstCar.carPrice);
        BigDecimal bd = new BigDecimal(myFirstCar.carPrice).setScale(2, RoundingMode.HALF_UP);
        System.out.println("current bigDecimal " + bd);

        // myFirstCar.color = "Green";
        // System.out.println("Here is the color of my car " + myFirstCar.color);
        // invoke myFirstCar's print info method
        // myFirstCar.printInfo();

        // System.out.println("Byte Size " + Byte.SIZE);
        // System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        // System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
        // myFirstCar.arithmetic();
        // myFirstCar.plusMinus();
        // myFirstCar.equalityOpTest();
        // myFirstCar.relationalAndLogicalOpTest();

    }

    public void printInfo() {
        if (!isThisCarAConvertible) {
            // color = myFirstCar.color();
            System.out.println("The " + color + " car is a convertible");
        } else {
            System.out.println("The " + color + " car is not a convertible");
        }
    }

    public void arithmetic() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);//how many times a can go into b as a whole
        System.out.println(b % a);//how much of the value we can get after a successful division = remainder
    }

    public void plusMinus() {
        driverAge++;
        System.out.println("Here is the driver's age " + (++driverAge));

        driverAge--;
        System.out.println("Here is the driver's age " + (driverAge--));
    }

    // Quality operators
    public void equalityOpTest() {
        String store = "Amazon";
        // String store2 = "Amazon";
        String store2 = "amazon";

        if (store != store2) {
            System.out.println("These stores are not equal");
        }
    }

    // relational Operators
    public void relationalAndLogicalOpTest() {
        short donutCount = 00;
        short autoClickerCost = 100;
        short actualFunds = 3000;

        // so we are combining two operations '&&'both values have to be equal to be
        // true, '||' don't have to be equal

        // enough funds for both purchases
        if (donutCount >= autoClickerCost && actualFunds >= carPrice) {
            System.out.println("You have enough funds to purchase both");
            // enough funds for autoClicker
        } else if (donutCount >= autoClickerCost) {
            System.out.println("You have enough funds to make an autoClicker purchase");
        }
        // enough funds for car
        else if (actualFunds >= carPrice) {
            System.out.println("You have enough funds to buy a car");
        }
        // you don't have enough to purchase anything
        else {
            System.out.println("Sorry your funds are insufficient");
        }
    }

}