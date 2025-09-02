public class InvertedAndRotetedPyramid {
    public static void InvertedAndRotetedHalfPyramid(int n) {
        // Outer
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedAndRotetedHalfPyramid(4);
    }
}
