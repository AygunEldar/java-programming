package officehours06_07;

import java.util.ArrayList;

public class WalmartTest {
    public static void main(String[] args) {

        WalmartStore storeOne = new WalmartStore("VA");
        System.out.println(storeOne);


        Item pen = new Item ("pen",1.4,10);
        Item hat = new Item ("hat",3.5,20);

        ArrayList<Item> allItems = new ArrayList<>();
        allItems.add(pen);
        allItems.add(hat);

        WalmartStore storeTwo = new WalmartStore("IL");
        System.out.println(storeTwo);
        System.out.println(WalmartStore.companyName);

    }



}
