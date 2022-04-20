import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    //String = "" Empty String
    @Test
    void emptyStringReturnZero(){
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add(""), 0);
    }

    //String = "1" Only one number
    @Test
    void singleStringReturnInt(){
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add("1"), 1);
    }

    //String = "1,2" Two numbers separated with comma
    @Test
    void stringWithTwoNumbers(){
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add("1,2"), 3);
    }

    //String = 1/n2,3 Three numbers separated with comma and new line.
    @Test
    void twoNumbersSeparatedByCommaAndMultiline(){
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add("1,2\n3"),6);
    }

    //String = //;\n1,2 Support different delimiters
    @Test
    void differentDelimitersReturnSum(){
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add("//;\n1,2"),3);
    }


}
