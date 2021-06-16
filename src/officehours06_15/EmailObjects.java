package officehours06_15;

public class EmailObjects {

    public static void main(String[] args) {

        Email email =new Email("Anton@cybertekschool.com",43);
        System.out.println(email);

        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();


        Gmail gmail = new Gmail("Elgun@gmail.com",133);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();



        Yahoo yahoo = new Yahoo("Eldar@yahoo.com",136);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();


        Email email2 = new Email("random@email",4);

        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);

        Email.sendEmail();
        Gmail.sendEmail();
        Gmail.sendSuperEmail();
    }
}
