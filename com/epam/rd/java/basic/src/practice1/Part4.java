package practice1;

import static java.lang.Integer.parseInt;

public class Part4 {
    public static void main(String[] args) {
        int nod = 0;
        if (parseInt(args[0])>0 & parseInt(args[1])>0){
            System.out.println(gcd(parseInt(args[0]), parseInt(args[1])));
        }
        else {
            System.out.println("Please put only positive numbers");
        }
    }

        static int gcd(int a, int b)
        {
            if (a == b)
                return a;

            if (a > b)
                return gcd(a-b, b);
            return gcd(a, b-a);
        }
}
