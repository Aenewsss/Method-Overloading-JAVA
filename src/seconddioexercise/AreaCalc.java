package seconddioexercise;

import java.util.Scanner;

/*
 * @author Aenã
 */
public class AreaCalc {
    
    private static void area(double side){
        double result = side * side;
        System.out.printf("Square area = %.2f \n", result);
    }

    private static void area(double base, double height){
        double result = base * height;
        System.out.printf("Rectangle area = %.2f \n", result);
    }

    private static void area(double majorBase, double minorBase, double height){
        double result = ((majorBase + minorBase) * height)/ 2;
        System.out.printf("Trapeze area = %.2f \n", result);
    }
    
    public static void areaCalc(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Lets calculate square area! Enter the side value:");
        double side = keyboard.nextDouble();
        area(side);

        System.out.println("Lets calculate rectangle area! Enter base and height value:");
        double base = keyboard.nextDouble();
        double height = keyboard.nextDouble();
        area(base, height);

        System.out.println("Lets calculate trapeze area! Enter major base, minor base and height value:");
        double majorBase = keyboard.nextDouble();
        double minorBase = keyboard.nextDouble();
        double heightT = keyboard.nextDouble();
        area(majorBase, minorBase, heightT);


    }
}
