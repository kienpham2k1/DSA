public class Convert {
    static void decToBin(int dec) {
        int q = dec / 2;
        int r = dec % 2;
        if (q > 0)
            decToBin(q);
        System.out.print(r);
    }

    static int toDecimal(String binary, int i) {
        // If we reached last character
        int n = binary.length();
        if (i == n - 1)
            return binary.charAt(i) - '0';

        // Add current tern and recur for
        // remaining terms
        return ((binary.charAt(i) - '0') << (n - i - 1)) +
                toDecimal(binary, i + 1);
    }

    public static void main(String[] args) {
        decToBin(45);
        String binary = "10101";
        int i = 0;
        System.out.println("\n" + toDecimal(binary, i));
    }
}
