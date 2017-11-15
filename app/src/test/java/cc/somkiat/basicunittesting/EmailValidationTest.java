package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

/**
 * Created by phatm on 11/15/2017.
 */

public class EmailValidationTest {

    @Test
    public void emailWrongFormat() {
        EmailValidation emailValidation = new EmailValidation();
        Boolean result = emailValidation.isValidEmailFormat("abc@.com");
        assertFalse("Email wrong format.", result);
    }

    @Test
    public void nullEmail() {
        EmailValidation emailValidation = new EmailValidation();
        Boolean result = emailValidation.isEmpty("");
        assertFalse("", result);
    }
}
