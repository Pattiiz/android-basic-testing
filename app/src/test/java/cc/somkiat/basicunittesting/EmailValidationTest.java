package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
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
    public void emailRightFormat() {
        EmailValidation emailValidation = new EmailValidation();
        Boolean result = emailValidation.isValidEmailFormat("pattiiz@gmail.com");
        assertTrue("Email right pattern.", result);
    }

    @Test
    public void emptyEmail() {
        EmailValidation emailValidation = new EmailValidation();
        Boolean result = emailValidation.isEmpty("");
        assertFalse("Email can't empty", result);
    }

    @Test
    public void nullEmail() {
        EmailValidation emailValidation = new EmailValidation();
        Boolean result = emailValidation.isNull(null);
        assertFalse("Email can't null", result);
    }
}
