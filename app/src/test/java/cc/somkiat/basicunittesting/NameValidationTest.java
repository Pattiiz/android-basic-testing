package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

/**
 * Created by student on 11/10/2017 AD.
 */

public class NameValidationTest {

    @Test
    public void nullName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isEmpty("");
        assertFalse("Not pass.It's empty.", result);
    }

    @Test
    public void specialCharacter() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isSpecialChar("Pattiiz..??");
        assertFalse("Not pass.It's have special character.", result);
    }

    @Test
    public void numericName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isNumeric("1234567890AAassfeee");
        assertFalse("Not correct.Have number in name.", result);
    }

    @Test
    public void longName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isTooLong("Titiphattttttttttttttttttttttttttttt");
        assertFalse("Not correct. Have more than 20 character in name", result);
    }

    @Test
    public void shortName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isTooShort("AA");
        assertFalse("Not correct. Have less than 2 character in name", result);
    }
}
