package practice1;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("cmd /c /go.bat");
        Part2.main(new String[] {"5", "6", "7"});
        Part3.main(new String[] {"go", "wait", "stop"});
        Part4.main(new String[] {"15", "6"});
        Part5.main(new String[] {"5", "6", "7", "8", "10"});
        Part6.main(new String[] {"20"});
        //       Part7.main();
    }
}
