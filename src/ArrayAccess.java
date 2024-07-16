package src;

import java.util.Scanner;

public class ArrayAccess {
    private int[] numbers;
    public ArrayAccess() {
        this.numbers = new int[] { 10, 20, 30, 40, 50 };
    }
    public void accessElement() {
        Scanner scanner = new Scanner(System.in);
        int index;

        while (true) {
            System.out.print("Enter an index to access : ");
            index = scanner.nextInt();

            if (index == -1) {
                break;
            }
            try {
                int value = numbers[index];
                System.out.println("Element at index " + index + " is: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index. Please enter a valid index.");
            }
        }
        scanner.close();
        System.out.println("Program ended.");
    }
public static void main(String[] args) {
    ArrayAccess arrayAccess = new ArrayAccess();
    arrayAccess.accessElement();
}
}