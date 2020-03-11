import java.util.Arrays;
import java.util.Scanner;

class TemperatureData {
    byte daysInMonth;
    double[] minimums;
    double[] maximums;
    double monthAverage;

    TemperatureData() {
        Scanner sc = new Scanner(System.in);
        // do {
        System.out.print("Enter the number of days in the month: ");
        this.daysInMonth = sc.nextByte();
        // } while (this.daysInMonth >=28 && this.daysInMonth <= 31);

        this.minimums = new double[this.daysInMonth];
        this.maximums = new double[this.daysInMonth];
        for (int i = 0; i < this.daysInMonth; i++) {
            System.out.print("Minimum for day " + i + 1 + ": ");
            this.minimums[i] = sc.nextDouble();
            System.out.print("Maximum for day " + i + 1 + ": ");
            this.maximums[i] = sc.nextDouble();
        }
        double avgMinimums = averageArray(this.minimums);
        double avgMaximums = averageArray(this.maximums);
        this.monthAverage = (avgMaximums + avgMinimums) / 2;
        double highMax = getHigh(this.maximums);
        double lowMax = getLow(this.maximums);
        double highMin = getHigh(this.minimums);
        double lowMin = getLow(this.minimums);
        byte daysAboveMax = daysAboveMax(this.maximums);

        System.out.printf("%-13s%-13s%-13s%-13s%-13s%-13s%-13s%n%-13f%-13f%-13f%-13f%-13f%-13f%-13d%n", "Avg Max.", "Avg Min.",
        "Max High", "Min High", "Max Low", "Min Low",
        "Days with Max > Total Avg", avgMaximums, avgMinimums, highMax, lowMax, highMin, lowMin, daysAboveMax);

    }

    double averageArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    double getHigh(double[] array) {
        double max = array[0];
        if (array.length > 1)
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i]);
            }
        return max;
    }

    double getLow(double[] array) {
        double min = array[0];
        if (array.length > 1)
            for (int i = 0; i < array.length; i++) {
                min = Math.min(min, array[i]);
            }
        return min;
    }

    byte daysAboveMax(double[] array) {
        byte dayCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > this.monthAverage)
                dayCounter++;
        }
        return dayCounter;
    }

    public static void main(String[] args) {
        TemperatureData td = new TemperatureData();
    }
}