/**
 * NaturalNumbers
 */
public class NaturalNumbers {
    static int findNaturalNumber(int num) {
        if (num == 0)
            return 1;
        else {
            return num * findNaturalNumber(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.printf("Natural of 5, %d", findNaturalNumber(5));
    }
}