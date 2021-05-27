package day08_casting_scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class CastingExamples {
    public static void main(String[] args) {

        //byte-short-int-long
        byte n1 = 100;
        short n2 = n1;
        int n3 = n2;
        long n4 = n3;
        int n5 = n1;
        float num6 = 124.4f;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);
        System.out.println(num9);

        int num1 = 55;
        byte num2 = (byte)num1;

        long num3 = 4444l;
        int num4 = (int)num3;
        byte num10 = (byte)num3;
        short num5 = (short)num3;
        byte num11 = (byte)num5;

        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println(num13);
        System.out.println(num14);

        System.out.println(num3);

        double num15 = 1234.5;
        int num16= (int)num15;

        System.out.println(num15);
        System.out.println(num16);

        int num17=300;
        byte num18=(byte)num17;
        System.out.println(num17);
        System.out.println(num18);

        char letter = 'A';
        int numLetter = letter;
        System.out.println("Letter = " + numLetter);
        System.out.println("numLetter = " + numLetter);

    }
}
