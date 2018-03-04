package Tutorial_4_5.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Huy
 */
public class index {
    public static void main(String[] args) {
        index ind = new index();
        Arrays arrays = new Arrays();
        while(true) {
        System.out.println(
                "Program: Arrays \n" +
                        "1. Count negative element \n" +
                        "2. Find min in array \n" +
                        "3. Determine array is ASC sorted \n" +
                        "4. Find length of CHAR array \n" +
                        "5. Find median of array \n" +
                        "6. Compare relation of 2 int arrays \n" +
                        "7. Compute frequencies of each element of int array \n" +
                        "q. Quit program."
        );
        System.out.println("Your option: ");
        Scanner option = new Scanner(System.in);
            switch (option.nextLine()) {
                case "1":
                    ind.countNegative(arrays);
                    continue;
                case "2":
                    ind.min(arrays);
                    break;
                case "3":
                    ind.isAscSorted(arrays);
                    break;
                case "4":
                    ind.length(arrays);
                    break;
                case "5":
                    ind.median(arrays);
                    break;
                case "6":
                    ind.compare(arrays);
                    break;
                case "7":
                    ind.freq(arrays);
                    break;
                case "q":
                    System.out.println("Good bye!");
                    System.exit(0);
            }
        }
    }

    private void countNegative(Arrays a){
        System.out.println("Number of negative element in array is: " + a.countNegative(createArrayInt()));

    }

    private void min(Arrays a) {
        System.out.println("The minimum element in array is: " + a.min(createArrayInt()));
    }

    private void isAscSorted(Arrays a) {
        System.out.println("The array is ascending sorted? " + a.isAscSorted(createArrayInt()));
    }

    private void length(Arrays a) {
        System.out.println("The length of array until character 'NUL' is: " + a.length(createArrayChar()));
    }

    private void median(Arrays a) {
        System.out.println("The median element of array is: " + a.median(createArrayInt()));
    }

    private void compare(Arrays a) {
        System.out.println("The relation between 2 arrays is: " + a.compare(createArrayInt(), createArrayInt()));
    }

    private void freq(Arrays a) {
        System.out.println("The frequencies of elements in arrays is: " + a.freq(createArrayInt()));
    }

    private int[] createArrayInt() throws NullPointerException, InputMismatchException {
        try {
            Scanner arrayIntScanner = new Scanner(System.in);
            System.out.println("Input your array length");
            return inputIntArrayElement(arrayIntScanner.nextInt());
        } catch (NullPointerException e) {
            throw new NullPointerException("Length of array has to be greater than zero!");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("You input an invalid value!");
        }
    }

    private char[] createArrayChar() throws NullPointerException,InputMismatchException {
        try {
            Scanner arrayCharScanner = new Scanner(System.in);
            System.out.println("Input your array length");
            return inputCharArrayElement(arrayCharScanner.nextInt());
        } catch (NullPointerException e) {
            throw new NullPointerException("Length of array has to be greater than zero!");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("You input an invalid value!");
        }
    }

    private int[] inputIntArrayElement(int length) throws InputMismatchException {
        try {
            int arrayInt[] = new int[length];
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < arrayInt.length; i++) {
                System.out.println("Enter element " + i + " of INT array: ");
                arrayInt[i] = scan.nextInt();
            }
            return arrayInt;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("You input an invalid value!");
        }
    }

    private char[] inputCharArrayElement(int length) throws InputMismatchException {
        try {
            Scanner scan = new Scanner(System.in);
            char arrayChar[] = new char[length];
            for (int i = 0; i < arrayChar.length; i++) {
                System.out.println("Enter element " + i + " of CHAR array: ");
                arrayChar[i] = scan.next(".").charAt(0);
            }
            return arrayChar;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("You input an invalid value!");
        }
    }
}
