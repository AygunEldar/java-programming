package officehours05_11;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchForElement {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "two"));
        System.out.println(findIndex(list, "two"));
        System.out.println(findIndex(list, "two", 2));
        System.out.println(findIndex(list, "two", findIndex(list,"two")+1));//same as line12


    }

    /**
     * @param words   - list of elements given
     * @param element - the element that we are looking for
     * @return the method returns the index where the elements is found in the given
     * ArrayList and if the the element does not exisit tjhe method returns -1
     */
    public static int findIndex(ArrayList<String> words, String element) {

        int index = -1;

        for (int i = 0; i < words.size(); i++) {

            if (words.get(i).equals(element)) {
                index = i;//return i;
                break;

            }
        }

        return index;


    }

    /**
     * * Overloading findIndex method to have a starting point
     * @param words      - list of elements given
     * @param element    - the element that we are looking for
     * @param startIndex - the index number basicly where search starts from
     * @return the method returns the index where the elements is found in the given
     * ArrayList and if the the element does not exisit tjhe method returns -1
     */
    public static int findIndex(ArrayList<String> words, String element, int startIndex) {

        int index = -1;

        for (int i = startIndex; i < words.size(); i++) {

            if (words.get(i).equals(element)) {
                index = i;//return i;
                break;

            }

        }
  return index;

    }
}