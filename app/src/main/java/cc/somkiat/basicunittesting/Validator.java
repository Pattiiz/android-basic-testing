package cc.somkiat.basicunittesting;

/**
 * Created by student on 17/11/2017 AD.
 */

public interface Validator {

    public Boolean isValid(String input);
    public String getErrorMessage();

}
