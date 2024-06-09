public class Fibomaci {
    static int findFibomaciNums(int numPosition) {

        return 0;
    }

    static int findNextFibomaciNums(int num) {
        if (num < 2)
            return num;
        else {
            return findFibomaciNums(num - 1) + findFibomaciNums(num - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("The next fibomaci of 5: " + findNextFibomaciNums(5));
    }
}
