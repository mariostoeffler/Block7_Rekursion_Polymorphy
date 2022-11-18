import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        //sumUpIterative(6);
        System.out.println(sumUpRec(5));
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(8);

        System.out.println(sumUpArray(integers));



    }

    public static int sumUpIterative(int n) {
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum = sum + i;
            System.out.println("Zwischensumme = " +sum);

        }
        System.out.println("Ergebnis = " + sum);
        return sum;

    }

    public static int sumUpRec(int n) {
        if (n <= 0) {
            return n;
        }

        return n + sumUpRec(n-1);

    }

    public static int sumUpArray (ArrayList<Integer> values) {
        int sum = 0;
        for (int i = 0; i < values.size() ; i++) {
            sum = sum + values.get(i);

        }
        return sum;
    }

    public static int recursiveSum(ArrayList<Integer> values) {
        if (values.size() == 0) {
            return 0;
        }
        Integer value = values.remove(0);

        return value + recursiveSum(values);

    }


}
