import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorShould {

    //String = "" Empty String
    @Test
    void emptyStringReturnZero() throws Exception{
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add(""), 0);
    }

    //String = "1" Only one number
    @Test
    void singleStringReturnInt() throws Exception {
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add("1"), 1);
    }

    //String = "1,2" Two numbers separated with comma
    @Test
    void stringWithTwoNumbers() throws Exception{
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add("1,2"), 3);
    }

    //String = 1/n2,3 Three numbers separated with comma and new line.
    @Test
    void twoNumbersSeparatedByCommaAndMultiline() throws Exception{
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add("1,2\n3"),6);
    }

    //String = //;\n1,2 Support different delimiters
    @Test
    void differentDelimitersReturnSum() throws Exception{
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add("//;\n1;2"),3);
    }

    //String = -1 or negative number return throw
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void whenExceptionThrown_thenRuleIsApplied() {
        exceptionRule.expect(NumberFormatException.class);
        exceptionRule.expectMessage("Negatives not allowed");
        Integer.parseInt("-1");
    }

}
