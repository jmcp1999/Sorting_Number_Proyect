package sorting.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the list of numbers (enter -1 to finish):");
        int num = 0;
        while (num != -1) {
            num = scanner.nextInt();
            if (num != 4 && num != -1) {
                numbers.add(num);
            } else if (num == 4) {
                System.out.println("The number 4 is not allowed to be entered.");
            }
        }

        System.out.println("Do you want to sort the numbers in ascending (1) or descending (2) order?");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            Collections.sort(numbers);
        } else if (opcion == 2) {
            Collections.sort(numbers, Collections.reverseOrder());
        } else {
            System.out.println("Invalid option. The numbers will not be ordered.");
        }

        System.out.println("Sorted list of numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
