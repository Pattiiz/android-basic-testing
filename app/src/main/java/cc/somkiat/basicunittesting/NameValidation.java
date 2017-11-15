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

    public Boolean isSpecialChar(String name) {
        if (!name.matches("[a-zA-Z]*")) {
            return false;
        }
        return true;
    }

    public Boolean isNumeric(String name) {
        try {
            double number = Double.parseDouble(name);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public Boolean isTooLong(String name) {
        if (name.length() > 20) {
            return false;
        }
        return true;
    }

    public Boolean isTooShort(String name) {
        if (name.length() < 2) {
            return false;
        }
        return true;
    }

    public Boolean isNull(String name) {
        if (name == null) {
            return false;
        }
        return true;
    }
}
