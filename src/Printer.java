public class Printer {

    public static void main(String[] args) {
        //printFromNToZero(5);
        //printFromNToZeroRecursive(5);
        printFromZeroToNRecursive(5);

    }

    public static void printFromNToZero(int n) {
        while (n >= 0) {
            System.out.println("n = " + n);
            n--;
        }
    }

    public static void printFromNToZeroRecursive(int n) {
        //Abbruchsbestimmung
        if (n < 0) {
            return;
        }
        System.out.println("n = " + n);
        //rufe mich selbst noch einmal auf
        printFromNToZeroRecursive(n - 1);

    }

    public static void printFromZeroToN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("n = " + i);

        }
    }

    public static void printFromZeroToNRecursive(int n) {
        if (n > n) {
            return;
        }
        printFromZeroToN(n + 1);
    }

}
