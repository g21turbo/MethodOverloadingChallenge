public class Main {

    public static void main(String[] args) {

        System.out.println("50in = " + convertToCentimeters(50) + "cm");
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 11) + "cm");

    }


    // My solutions - I see that I could have simplified, This was before the instructor revealed their answer
    public static double convertToCentimeters(int heightInInches) {
        double centimeters =  heightInInches * 2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {

       double feetToInches = heightInFeet * 12;
       double totalHeight = feetToInches + remainingHeightInInches;
       double centimeters = convertToCentimeters((int)totalHeight);
       return centimeters;

    }

    // Instructors solutions

    public static double instructorConvertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double instructorConvertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet*12) + inches);
    }
}