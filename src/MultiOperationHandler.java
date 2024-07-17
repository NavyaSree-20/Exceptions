package src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiOperationHandler {
    public void performOperations() {
        try {
            int result = divideNumbers(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException found");
        }
        try {
            // Array access operation
            int[] array = {1, 2, 3};
            System.out.println("Array element at index 3: " + array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException.");
        }
        try {
            // File reading operation
            readFromFile("nonexistent-file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: File not found.");
        } catch (IOException e) {
            System.out.println("IOException: Error reading the file.");
        }
    }
    private int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }

    private void readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        System.out.println("First line of the file: " + line);
        reader.close();
    }
    public static void main(String[] args) {
        MultiOperationHandler handler = new MultiOperationHandler();
        handler.performOperations();
}
}