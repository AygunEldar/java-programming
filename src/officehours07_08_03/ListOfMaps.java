package officehours07_08_03;

import java.util.*;

public class ListOfMaps {

    public static void main(String[] args) {

        List<Map<String, String>> employees = new ArrayList<>();

        Map<String, String> empData = new HashMap<>();


        empData.put("EmpID", "5350");
        empData.put("EmpName", "John");
        empData.put("JobTitle", "SDET");
        empData.put("Salary", "130000");

        Map<String, String> emp2Data = new HashMap<>();

        emp2Data.put("EmpID", "1236");
        emp2Data.put("EmpName", "Ayka");
        emp2Data.put("JobTitle", "Dev");
        emp2Data.put("Salary", "220000");


        employees.add(empData);
        employees.add(emp2Data);
        System.out.println("employees.toString() = " + employees.toString());

        System.out.println(employees.get(1).get("Salary"));

        employees.get(0).put("Salary", "15000");
        System.out.println(employees.get(0).get("Salary"));

        System.out.println("***************");

        List<String> list = Arrays.asList("23", "a", "23", "m", "a", "t", "hh", "t");

        Set<String> unique = new HashSet<String>();


    }

}
