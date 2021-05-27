package saim_only_03_17;
import java.util.Scanner;
public class TernaryEligibleToGetLoan {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter salary and credit score");
        double ySalary =scan.nextDouble();
        int creditScore = scan.nextInt();
        String loan= ySalary > 60.000 && creditScore > 650 ? "Loan Approved" : " Loan Denied";
        System.out.println("Loan = " + loan);
    }

}
