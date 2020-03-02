import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the traffic light's colour: ");
        String colour = scanner.nextLine();
        scanner.close();

        String stop = "Stop";
        String slow = "Come to a gradual stop";
        String go = "Proceed through the intersection";

        if (colour.equalsIgnoreCase("red")) {
            System.out.println(stop);
        } else if (colour.equalsIgnoreCase("yellow") || colour.equalsIgnoreCase("orange")) {
            System.out.println(slow);
        } else if (colour.equalsIgnoreCase("green")){
            System.out.println(go);
        } else {
            System.out.println("Enter green, yellow or red");
        }
    }

}