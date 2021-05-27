package mine_mine;

public class StringConcotanation {
    public static void main (String [] args){
        String year = "CyberTek";
        System.out.println(year +7+20+21 );//72021
        System.out.println(year + 7+(20+21));//741
        System.out.println(year + (7+20)+21);//2721
        System.out.println(year +(7)+(20)+(21));//72021
        System.out.println(year + (7+ 20+ 21));//48
        System.out.println(7+ year+20+21);//7CyberTek2021
        System.out.println(7+ year +(20+21));//7CyberTek42
        System.out.println(7+20+21+year);
    }
}
