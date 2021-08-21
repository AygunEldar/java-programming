package InterviewTasks;

import java.util.stream.IntStream;

public class From_1To_100 {
    public static void main(String[] args) {
        //MAX VERSION

            IntStream.range(1, 101).forEach(n -> System.out.print(n + " "));


    }
}
