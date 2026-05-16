class GFFD {
    public static void printRow(int n) {
        if (n == 0) return;
        System.out.print("* ");
        printRow(n - 1);
    }
    public static void changeRow(int n) {
        if (n == 0) return;
        changeRow(n - 1);
        printRow(n);
        System.out.println();
    }
    public static void main(String[] args) {
        changeRow(5);
    }
}