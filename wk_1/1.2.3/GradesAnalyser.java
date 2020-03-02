import java.util.Scanner;
import java.lang.Math;

public class GradesAnalyser {

    public GradesAnalyser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark for student 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter the mark for student 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter the mark for student 3: ");
        int mark3 = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Average grade: %f%nHighest mark: %d%nLowest mark: %d%n",
                (double) (mark1 + mark2 + mark3) / 3, Math.max(mark1, Math.max(mark2, mark3)),
                Math.min(mark1, Math.min(mark2, mark3)));
        scanner.close();
    }

    public static void main(String[] args) {
        GradesAnalyser gradesAnalyser = new GradesAnalyser();
    }
}