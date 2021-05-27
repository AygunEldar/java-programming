package again_again;

public class Class22_indexOfExample {
    public static void main(String [] args){

        String tech="java,selenium,html,css,testng,maven";

        System.out.println(tech.indexOf(","));
        System.out.println(tech.lastIndexOf(","));
        System.out.println(tech.indexOf("a"));
        System.out.println(tech.lastIndexOf("a"));

        int indexOfJava = tech.indexOf("java");
        System.out.println("java is at index " +indexOfJava);
        int indexOfTestng =tech.indexOf("testng");
        System.out.println("indexOfTestng = " + indexOfTestng);

        if(tech.contains("html")){
            System.out.println("html present");
        }else {
            System.out.println("html not present");
        }

            if(tech.contains("maven")){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

if(tech.indexOf("maven") > -1){
    System.out.println("exits");
}else{
    System.out.println("not exists");
}
        System.out.println("************************");
  if(tech.indexOf("len") > 0){
      System.out.println("present");
  }else{
      System.out.println("not present");
  }


    }
}
