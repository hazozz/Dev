/**
 * OOPSBannerApp - UC3
 * Prints the OOPS banner using String.join()
 * instead of string concatenation.
 * 
 * @author Hemanth
 * @version 1.0
 */

public class UseStringJoin {

    public static void main(String[] args) {

        System.out.println(String.join("", " ***** ", "   ", " ***** ", "   ", " ***** ", "   ", " ***** "));
        System.out.println(String.join("", "*     *", "   ", "*     *", "   ", "*     *", "   ", "*      "));
        System.out.println(String.join("", "*     *", "   ", "*     *", "   ", "*     *", "   ", "*      "));
        System.out.println(String.join("", "*     *", "   ", "*     *", "   ", " ***** ", "   ", " ***** "));
        System.out.println(String.join("", "*     *", "   ", "*     *", "   ", "*      ", "   ", "     *"));
        System.out.println(String.join("", "*     *", "   ", "*     *", "   ", "*      ", "   ", "     *"));
        System.out.println(String.join("", " ***** ", "   ", " ***** ", "   ", "*      ", "   ", " ***** "));
    }
}