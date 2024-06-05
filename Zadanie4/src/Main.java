import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int readNumber() throws NegativeNumberException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Give number: ");
            int num = sc.nextInt();
            if (num < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed", 0);
            }
            return num;
        } catch (NegativeNumberException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int[] fillArray() throws NegativeNumberException {
        int[] tab = new int[10];
        int num;
        for(int i = 0; i < tab.length; i++) {
            num = readNumber();
            tab[i] = Math.max(num, 0);
        }
        return tab;
    }

    public static void main(String[] args) throws NegativeNumberException {
        System.out.println(Arrays.toString(fillArray()));
    }
}