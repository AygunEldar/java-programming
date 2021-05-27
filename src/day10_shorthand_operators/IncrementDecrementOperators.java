package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main (String [] args ){

        int i = 1;
        System.out.println("i = " +i);
        i++;
        System.out.println("i = " +i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = "+ i);

        int linesOfCode = 15;
        System.out.println("Lines of Code = "+ linesOfCode);
        linesOfCode = linesOfCode +1;
        linesOfCode++;
        ++linesOfCode;
        linesOfCode +=1;
        System.out.println("LinesOfCode = " + linesOfCode);
        linesOfCode = linesOfCode - 1;
        linesOfCode--;
        --linesOfCode;
        linesOfCode-=1;
        System.out.println("Lines of Code = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter ="+ letter);
        letter--;
        System.out.println("letter ="+ letter);
        letter++; // change to next character
        System.out.println("letter ="+ letter);
        ++letter;
        ++letter;
        System.out.println("letter ="+ letter);
        --letter;
        System.out.println("letter ="+ letter);
        letter--;letter--;letter--;
        System.out.println("letter ="+ letter);



    }
}
