package practice1;

public class Part2 {
    public static void main(int[] args) {
        int sum = 0;
            for ( int x : args ) {
                sum += x;
            }
            System.out.println(sum);
    }
}
