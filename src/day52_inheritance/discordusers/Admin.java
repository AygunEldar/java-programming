package day52_inheritance.discordusers;

public class Admin extends User{

    public  Admin(){
        super(); //call super class/ user class no- args constructor
        System.out.println("Admin class constructor");
    }

    public Admin (String name, int Id){

        super("Admin",name, Id);
        System.out.println("Admin class 2 args constructor");
    }
    public String toString(){

        return "Admin{" +
                "name='" + getName() + '\'' +
                ", role='" + getRole() + '\'' +
                ", Id=" + getId() +
                '}';
    }
}
