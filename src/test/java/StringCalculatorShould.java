import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    @Test
    void emptyStringReturnZero(){
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add(""), 0);
    }

    @Test
    void singleStringReturnInt(){
        StringCalculator calc = new StringCalculator();
        assertEquals(calc.add("1"), 1);
    }
}
