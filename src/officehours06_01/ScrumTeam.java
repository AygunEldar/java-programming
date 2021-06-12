package officehours06_01;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    //  Attributes:
    //                            PO, BA, SM,
    //                            ArrayList<Tester> testersList = new ArrayList<>(),
    //                            ArrayList<Developer> devopsList = new ArrayList<>(),
    //                            (hasSprint, hasMeeting) sprintNumber
    //
    //                Constructor:
    //                      sets the names of: PO, BA, SM
    //
    //                Actions:
    //
    //                   addTester(Tester tester): adds the given tester to the testers arraylist
    //
    //                   addTesters(Tester[] testers): adds the given testers to the testers arraylist
    //
    //                   addDeveloper(Developer developer): adds the given developer to the developers arraylist
    //
    //                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
    //
    //                   removeTester(long employeeID): removes the given tester from the testers arraylist
    //
    //                   removeDeveloper(long employeeID): removes the developer from the developers arraylist
    //
    //                   toString(): prints number of tester,& developers,  PO name, SM name, BA name

    String productOwner;
    String scrumMaster;
    String businessAnalyst;
    ArrayList<Tester>allTesters = new ArrayList<>();
    ArrayList<Developer>allDeveloper = new ArrayList<>();
    int sprintNumber;

    public ScrumTeam( String productOwner,String scrumMaster,String businessAnalyst){
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
        this.businessAnalyst = businessAnalyst;
        this.allTesters = new ArrayList<>();
        this.allDeveloper = new ArrayList<>();

    }
    public void addTester(Tester tester){
        this.allTesters.add(tester);
    }
    public void addTester(Tester... testers) { //varArgs ; Tester [] testers
        this.allTesters.addAll(Arrays.asList(testers));

    }
        public void addDevelopers(Developer developer){
            this.allDeveloper.add(developer);
        }
        public void addDeveloper(Developer... developer){ //varArgs ; Tester [] testers
            this.allDeveloper.addAll(Arrays.asList(developer));

        }
        public boolean removeTester(int employeeId){
        for(int i =0; i<allTesters.size();i++){
            if(allTesters.get(i).getEmployeeID() == employeeId){
                allTesters.remove(i);
                return true;
            }
        }
            return false;
        }
        public boolean removeDeveloper(int employeeId){
        int size = allDeveloper.size();
     //   allDeveloper.removeIf(eachDev ->eachDev.getEmployeeId() == employeeId);
        return size != allDeveloper.size();

        }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", scrumMaster='" + scrumMaster + '\'' +
                ", businessAnalyst='" + businessAnalyst + '\'' +
                ", allTesters=" + allTesters +
                ", allDeveloper=" + allDeveloper +
                ", sprintNumber=" + sprintNumber +
                '}';
    }
    //        Tester tester1 =new Tester("Max", 10, "SDET", 12500000);
//    scrumTeam.addtester(tester1);
//    scrumTeam.addtester("Anna",11,"SDET",1000000);
//    scrumTeam.removetester(12);

//    public static void main(String[] args) {
//        ScrumTeam scrumTeam = new ScrumTeam("Ziba", "John", "Joe");
//        System.out.println(scrumTeam.allTesters);
//        Tester tester1 = new Tester("Max", 10, "SDET", 12500000);
//        scrumTeam.addTester(tester1);
//        scrumTeam.addTester(new Tester("Anna",11,"SDET",1000000));
//        System.out.println(scrumTeam.allTesters);
//
//        scrumTeam.addDeveloper(new Developer("Anton",1,"Dev",1000000));
//        System.out.println(scrumTeam.allDeveloper);
//    }
}
