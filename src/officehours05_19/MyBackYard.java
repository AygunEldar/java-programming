package officehours05_19;

public class MyBackYard {
    public static void main(String[] args) {

        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();
        birdOne.setCanFly(true);
        System.out.println(birdOne.isCanFly());

      birdTwo.setBeakLength(-1);
        System.out.println(birdTwo.getBeakLength());

        birdOne.isCanFly();
        System.out.println(birdOne);

    }
}
