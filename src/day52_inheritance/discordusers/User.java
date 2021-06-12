package day52_inheritance.discordusers;

public class User extends Object{
   private String name;
   private String  role;
   private int Id;

    public User() {
        System.out.println("User class constructor");
    }
    public User(String role, String name, int Id){
        this.role = role;
        this.name = name;
        this.Id = Id;

    }


    @Override
    public String toString () {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", Id=" + Id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }






}
