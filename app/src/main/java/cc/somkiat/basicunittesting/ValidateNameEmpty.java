package cc.somkiat.basicunittesting;

/**
 * Created by student on 17/11/2017 AD.
 */

public class ValidateNameEmpty implements Validator {

    @Override
    public Boolean isValid(String input) {
        if (input.isEmpty())
            return true;
        return false;
    }

    @Override
    public String getErrorMessage() {
        return "Name is empty.";
    }
}
