package july;

import java.util.stream.IntStream;

public class OnetoHundred {
    public static void main(String[] args) {

        IntStream.range(1,101).forEach(n-> System.out.print(n+ " "));
    }
}
