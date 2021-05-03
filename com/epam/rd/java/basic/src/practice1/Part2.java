package practice1;

import static java.lang.Integer.parseInt;

public class Part2 {
    public static void main(String[] args) {
        int sum = 0;
            for ( String x : args ) {
                sum += parseInt(x);
            }
            System.out.println(sum);
    }
}
