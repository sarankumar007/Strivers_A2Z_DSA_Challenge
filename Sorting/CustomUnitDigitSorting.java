// The program must accept N integers as the input.
// The program must sort the integers based on their unit digit in descending order and print them as the output.
// If more than one integers have the same unit digit then the larger integer must appear first in the output.

import java.util.*;

public class UnitDigitSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                int unitDigit1 = Math.abs(num1) % 10;
                int unitDigit2 = Math.abs(num2) % 10;
                
                if (unitDigit1 != unitDigit2) {
                    return Integer.compare(unitDigit2, unitDigit1);
                } else {
                    return Integer.compare(num2, num1);
                }
            }
        });
        
        System.out.println("Sorted integers based on unit digit in descending order:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
