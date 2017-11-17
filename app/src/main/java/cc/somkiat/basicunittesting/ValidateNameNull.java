package cc.somkiat.basicunittesting;

/**
 * Created by student on 17/11/2017 AD.
 */

public class ValidateNameNull implements Validator {

    @Override
    public Boolean isValid(String input) {
        if (input == null)
            return false;
        return true;
    }

    @Override
    public String getErrorMessage() {
        return "Name is null.";
    }
}
