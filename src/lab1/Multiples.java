package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }

    static int multiples(int n, int a, int b) {
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                j++;
            }
        }
        return j;
    }

    static int multiples() {
        int n = 1000;
        int a = 3;
        int b = 5;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                j++;
            }
        }
        return j;
    }
}
