package day48_constructors_static;


import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {


        Group group1 = new Group("CyberBugs");//dependency injection. Group depends on String name
        // print size of members

        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");


        System.out.println(group1.getMembers().size());
        System.out.println(group1);//(group1.toString)

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephan","Akrem","Bulent","Andrea","Andrie","Wakshum"));

        //print all members, not toString()

        System.out.println("group2 members are - "+group2.getMembers());

        //check if Akrem is in group2
       if(group2.getMembers().contains("Akrem")) {

           System.out.println("Akrem is in gr2");
       }else{

           System.out.println("Not a member");
       }


       //remove a member from group 1
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
       // group1.removeMember("Ali");
        System.out.println(group1);

    }
}
