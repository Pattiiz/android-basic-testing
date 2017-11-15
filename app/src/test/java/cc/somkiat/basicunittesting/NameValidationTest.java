package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

/**
 * Created by student on 11/10/2017 AD.
 */

public class NameValidationTest {

    @Test
    public void emptyName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isEmpty("");
        assertFalse("Not pass.It's empty.", result);
    }

    @Test
    public void nullName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isNull(null);
        assertFalse("Not pass.It's null.", result);
    }

    @Test
    public void specialCharacterInName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isSpecialChar("Pattiiz..??");
        assertFalse("Not pass.It's have special character.", result);
    }

    @Test
    public void numericNameInName() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isNumeric("1234567890AAassfeee");
        assertFalse("Not correct.Have number in name.", result);
    }

    @Test
    public void longerThanTwentyCharacter() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isTooLong("Titiphattttttttttttttttttttttttttttt");
        assertFalse("Not correct. Have more than 20 character in name", result);
    }

    @Test
    public void shorterThanTwoCharacter() {
        NameValidation nameValidation = new NameValidation();
        Boolean result = nameValidation.isTooShort("A");
        assertFalse("Not correct. Have less than 2 character in name", result);
    }
}
