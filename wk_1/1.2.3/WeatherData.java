import java.util.Scanner;

public class WeatherData {
    public WeatherData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("Please enter the day: ");
        String day = input.nextLine();

        System.out.print("Please enter the time: ");
        int time = input.nextInt();

        System.out.print("Please enter the temperature: ");
        double temperature = input.nextDouble();
        input.nextLine(); // consumes the \n created when the user presses return, stopping the next
                          // nextLine() from being skipped

        System.out.print("Please enter the weather conditions: ");
        String conditions = input.nextLine();

        System.out.print("Please enter the precipitation (mm): ");
        double precipitation = input.nextDouble();

        System.out.printf("Name: %s%nDay: %s%nTime: %d%nTemperature: %f%nConditions: %s%nPrecipitation: %f%n", name, day, time,
                temperature, conditions, precipitation);
        input.close();
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
    }
}