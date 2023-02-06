import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sideLengthOne = 1;
        double sideLengthTwo = 1;
        double perimeter;
        double diagonal;

        System.out.println("Enter one side of the rectangle: ");
        if(sc.hasNextDouble()){
            sideLengthOne = sc.nextDouble();
        }else{
            System.out.println("Invalid Input. Please run again with valid input.");
            System.exit(0);
        }

        System.out.println("Enter the other side of the rectangle: ");
        if(sc.hasNextDouble()){
            sideLengthTwo = sc.nextDouble();
        }else{
            System.out.println("Invalid Input. Please run again with valid input.");
            System.exit(0);
        }

        perimeter = sideLengthOne*2 + sideLengthTwo*2;
        diagonal = sqrt((pow(sideLengthOne,2)) + (pow(sideLengthTwo,2)));

        System.out.println("The perimeter of your rectangle is " + perimeter);
        System.out.println("The diagonal distance of your rectangle is " + diagonal);
    }
}