package April.ElgunAZE;

import java.util.HashSet;
import java.util.Set;

public class AllSetEXam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("ablm");
        set.add("aba");
        set.add("ciyelek");
        set.add("yemis");
        /*
set.stream().filter(n -> n.equals("armud")).forEach(each -> System.out.println(each));

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("armud")) {
                System.out.println(str);
            }
        }
 */

        set.stream().filter(each -> each.length()>0).sorted().forEach(each -> System.out.println(each));









//        //set.stream().filter(n-> n.length() > 3).forEach(n -> System.out.println(n));
//        List<String> list2 = set.stream().filter(n-> n.length()>3).collect(Collectors.toList());
//        System.out.println(list2);







    }
}

