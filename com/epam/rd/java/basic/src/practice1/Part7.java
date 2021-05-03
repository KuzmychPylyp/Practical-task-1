package practice1;

public class Part7 {
    public static void main(String[] args) {
        System.out.println(int2str(1));
        System.out.println( int2str(2));
        System.out.println(int2str(26));
        System.out.println(str2int("AA"));
        System.out.println(str2int("AZ"));
        System.out.println(str2int("BA"));

        System.out.println(rightColumn("A"));
        System.out.println(rightColumn("B"));
        System.out.println(rightColumn("Z"));
    }
    public static String int2str(int number)
    {
        StringBuilder columnName = new StringBuilder();
        while (number > 0) {
            int rem = number % 26;
            if (rem == 0) {
                columnName.append("Z");
                number = (number / 26) - 1;
            }
            else
            {
                columnName.append((char)((rem - 1) + 'A'));
                number = number / 26;
            }
        }
        return String.valueOf((columnName.reverse()));
    }

    public static int str2int(String number)
    {
        int result = 0;
        for (int i = 0; i < number.length(); i++)
        {
            result *= 26;
            result += number.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public static String rightColumn(String number){
        int x = str2int(number);
        return int2str(x+1);
    }
}
