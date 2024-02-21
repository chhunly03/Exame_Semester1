import java.util.Scanner;

public class RangeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialSize = 5;
        System.out.print("Enter numbers if number is negative is stop: ");

        int[] numbers = new int[initialSize];
        int count = 0;

        int input = scanner.nextInt();
        while (input >= 0) {
            if (count == numbers.length) {
                // Resize the array if it is full
                int[] newArray = new int[numbers.length * 2];
                System.arraycopy(numbers, 0, newArray, 0, numbers.length);
                numbers = newArray;
            }
            numbers[count] = input;
            count++;
            System.out.print("Enter numbers if number is negative is stop: ");
            input = scanner.nextInt();
        }

        System.out.println("List of numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i]+"\t");
        }

        scanner.close();
    }
}
