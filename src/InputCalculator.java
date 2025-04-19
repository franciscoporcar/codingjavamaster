import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long average = 0;
        //String input = scanner.nextLine();

        while (scanner.hasNextInt()){
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        };

        if (count > 0) {
            //average = new Integer(Math.round(sum / count));
            average = Math.round( (double) sum / count );
            System.out.println("SUM = " + sum + " AVG = " + average);
        } else
            System.out.println("SUM = 0 AVG = 0");

        scanner.close();
    }
}
