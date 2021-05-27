package day32_array_split;

public class AWSZones {
    public static void main(String[] args) {


        String app ="etsy";
        String zone = "us-east-1,us-west-2,us-west-1";

        System.out.println("------Starting deployment of etsy app to AWS zones....");

        String [] zonesToDeploy = zone.split(",");

        for(String each : zonesToDeploy){
            System.out.println("Deploying [ "+ app +"] to "+each + " ....");
            System.out.println("Deployment completed for "+ each+ ".....");
        }

        System.out.println("----All deployments have been completed, traffic enabled-----");

    }
}
