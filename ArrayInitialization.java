/**
 * OOPS Banner App - UC5
 * Uses array declaration + initialization with String.join()
 * and prints using enhanced for-loop.
 */

public class ArrayInitialization {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", " ***** ", "   ", " ***** ", "   ", " ***** ", "   ", " ***** "),
            String.join("", "*     *", "   ", "*     *", "   ", "*     *", "   ", "*      "),
            String.join("", "*     *", "   ", "*     *", "   ", "*     *", "   ", "*      "),
            String.join("", "*     *", "   ", "*     *", "   ", " ***** ", "   ", " ***** "),
            String.join("", "*     *", "   ", "*     *", "   ", "*      ", "   ", "     *"),
            String.join("", "*     *", "   ", "*     *", "   ", "*      ", "   ", "     *"),
            String.join("", " ***** ", "   ", " ***** ", "   ", "*      ", "   ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}