package practice1;

public class Part4 {
    public static void main(int[] args) {
        int nod = 0;
        if (args[0]>0 & args[1]>0){
            System.out.println("GCD of " + args[0] +" and " + args[1] + " is " + gcd(args[0], args[1]));
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
