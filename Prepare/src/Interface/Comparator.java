package Interface;

public class Comparator {
    public static void main(String[] args) {
        int[] arrInt = { 1, 2, 5 };
        String arrString[] = { "A", "B", "C", "D" };
        int sumEven = 0;

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 == 0)
                sumEven += arrInt[i];
            arrString[i] += sumEven;
        }
        System.out.print(arrString[0] + arrInt[1] + arrString[2]);
    }
}
