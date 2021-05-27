package April.ElgunAZE;

import java.util.ArrayList;
import java.util.List;

public class Zombi2VarBahruz {
    public static void main(String[] args) {
        int[] inhabitants = {10, 5, 0, 0, 4, 7, 6, 2};
        List<Integer> arrList = new ArrayList<>();
        int sum = 0;
        for (int each : inhabitants) {
            arrList.add(each);
            sum += each;
        }
        System.out.println(arrList);
        while (sum > 1) {
            sum = 0;
            for (int i = 0; i < arrList.size(); i++) {
                ArrayList<Integer> list = new ArrayList<>(arrList);
                if (list.get(i) == 0) {
                    if (i == 0) {
                        list.set(i + 1, list.get(i + 1) / 2);
                    } else if (i == list.size() - 1) {
                        list.set(i - 1, list.get(i - 1) / 2);
                    } else {
                        list.set(i + 1, list.get(i + 1) / 2);
                        list.set(i - 1, list.get(i - 1) / 2);
                    }
                }
                arrList = list;
                sum += list.get(i);
            }
            System.out.println(arrList);
        }
    }
}
