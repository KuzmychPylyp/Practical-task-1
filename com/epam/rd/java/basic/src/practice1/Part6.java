package practice1;

import java.util.Arrays;

public class Part6 {
    public static void main(int size) {
        int[] prime = new int[size];
        int ind = 0;
        for (int i = 2; ind < prime.length; i++){
            if (isPrime(i)) {
                prime[ind] = i;
                ind++;
            }
        }
        System.out.println(Arrays.toString(prime));
    }

        static boolean isPrime(int num) {
            int counter = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    counter = counter + 1;
            }

            if (counter == 2)
                return true;
            else
                return false;

        }
}