package cc.somkiat.basicunittesting;

/**
 * Created by student on 11/10/2017 AD.
 */

class NameValidation {
    public Boolean isEmpty(String name) {
        if (name.isEmpty()) {
            return false;
        }
        return true;
    }
}
