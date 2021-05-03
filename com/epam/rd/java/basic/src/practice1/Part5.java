package practice1;

public class Part5 {
    public static void main(int[] args) {
        int sum = 0;
        boolean neg = false;
        for (int x: args) {
            if (x > 0) {
                sum += x;
            }
            else {
                System.out.println("Please put only positive numbers");
                neg = true;
                break;
            }
        }
        if (neg == false)
        System.out.println(sum);
    }
}
