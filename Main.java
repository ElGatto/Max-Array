import java.util.Scanner;

public class Main {
    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0)
            return null;

        E max = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] numbers = new Integer[10];

        System.out.print("Enter 10 integers: ");//ask user to enter only 10 integers.


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        Integer maxNumber = max(numbers);

        if (maxNumber != null) { //will show total.
            System.out.println("The max number is " + maxNumber);
        } else {
            System.out.println("No numbers entered.");//numbers only
        }
    }
}