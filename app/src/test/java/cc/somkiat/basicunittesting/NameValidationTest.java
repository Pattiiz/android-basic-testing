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
    public void spacialCharacter() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isSpacialChar("Pat.?*");
        assertFalse(result);
    }

    @Test
    public void numericName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isNumeric("1234567890AAassfeee");
        assertFalse(result);
    }

    @Test
    public void longName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isTooLong("Titiphattttttttttttttttttttttttttttt");
        assertFalse(result);
    }

    @Test
    public void shortName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isTooShort("A");
        assertFalse(result);
    }
}
