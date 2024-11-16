import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Gather user input for weight and height (feet and inches)
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height (feet): ");
        double feet = input.nextDouble();
        System.out.print("Enter your height (inches): ");
        double inches = input.nextDouble();

        //Constant values for converting to metric system
        double kilo_per_pound = 0.45359237;
        double meter_per_inch = 0.0254;

        //Compute BMI
        weight *= kilo_per_pound;
        double total_inches= (feet * 12)  + inches;
        double height = total_inches * meter_per_inch;
        double bmi = weight/(Math.pow(height,2));

        //Display Result
        System.out.print("BMI is " + bmi + "\n");

        if (bmi < 18.5)
            System.out.print("Underweight");
        else if (bmi < 25.0)
            System.out.print("Normal");
        else if (bmi < 30)
            System.out.print("Overweight");
        else
            System.out.print("Obese");

            

    }
}
