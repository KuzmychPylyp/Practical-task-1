package practice1;

import static java.lang.Integer.parseInt;

public class Part5 {
    public static void main(String[] args) {
        int sum = 0;
        boolean neg = false;
        for (String x: args) {
            if (parseInt(x) > 0) {
                sum += parseInt(x);
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
