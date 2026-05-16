public class GFGOPOI {
    public static void FlippedPyramidStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 2 * (n - i); j >= 0; j--) System.out.print(" ");
            for (int j = 0; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FlippedPyramidStar(5);
    }
}