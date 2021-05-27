package again_again;

public class ResultNumber {
    public static void main(String[] args) {

        String result = "1-48 of over 4000 result for java book";

        result =result.replace("1-48 of over","").replace("result for java book","");
        System.out.println("result = " + result);

    }
}
