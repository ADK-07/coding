
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double temperature;
            String unit;
            double newTemp;

            System.out.println("this is temperature converting program.");

            System.out.print("Enter the temperature:");
            temperature = sc.nextDouble();
            
            // not consuming the newline character (\n) after the number input, which results in nextLine() reading an empty string
            sc.nextLine();

            System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
            unit = sc.nextLine().toUpperCase();

            newTemp = (unit.equals("C")) ? (temperature -32) * 5 / 9 : (temperature * 5 / 9) + 32;
            System.out.printf("%.1f°%S",newTemp, unit);

            sc.close();
        }
    }
}
