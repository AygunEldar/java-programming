package day51_inheritance_overriding.super_keyword;

public class Lux extends Lyft{
    @Override
    double calculateRate(double miles){
        //calculate of Lyft + plus 20 percent

        return super.calculateRate(miles) * 12;
    }
}
