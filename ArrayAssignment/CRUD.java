package ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[0];
        boolean exit = false;

        while (!exit) {
            System.out.println("Select an operation:");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    int newElement = scanner.nextInt();
                    array = create(array, newElement);
                    System.out.println("Array after adding element: " + Arrays.toString(array));
                    break;
                case 2:
                    System.out.println("Array elements: " + Arrays.toString(array));
                    break;
                case 3:
                    System.out.print("Enter the index of the element to update: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter the new value: ");
                    int newValue = scanner.nextInt();
                    array = update(array, index, newValue);
                    System.out.println("Array after updating element: " + Arrays.toString(array));
                    break;
                case 4:
                    System.out.print("Enter the index of the element to delete: ");
                    int deleteIndex = scanner.nextInt();
                    array = delete(array, deleteIndex);
                    System.out.println("Array after deleting element: " + Arrays.toString(array));
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
        scanner.close();
    }
    // Create operation - add element to the end of the array
    private static int[] create(int[] array, int newElement) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = newElement;
        return newArray;
    }

    // Update operation - update the value at a given index
    private static int[] update(int[] array, int index, int newValue) {
        if (index >= 0 && index < array.length) {
            int[] newArray = Arrays.copyOf(array, array.length);
            newArray[index] = newValue;
            return newArray;
        } else {
            System.out.println("Invalid index! No changes made.");
            return array;
        }
    }

    // Delete operation - remove the element at a given index
    private static int[] delete(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            return newArray;
        } else {
            System.out.println("Invalid index! No changes made.");
            return array;
        }
    }
}
