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
}