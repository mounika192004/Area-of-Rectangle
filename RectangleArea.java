import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using int data type
        System.out.print("Enter length of rectangle (int): ");
        int lengthInt = scanner.nextInt();

        System.out.print("Enter width of rectangle (int): ");
        int widthInt = scanner.nextInt();

        int areaInt = lengthInt * widthInt;
        System.out.println("Area of rectangle (int): " + areaInt);

        // Using float data type
        System.out.print("Enter length of rectangle (float): ");
        float lengthFloat = scanner.nextFloat();

        System.out.print("Enter width of rectangle (float): ");
        float widthFloat = scanner.nextFloat();

        float areaFloat = lengthFloat * widthFloat;
        System.out.println("Area of rectangle (float): " + areaFloat);

        scanner.close();
    }
}

