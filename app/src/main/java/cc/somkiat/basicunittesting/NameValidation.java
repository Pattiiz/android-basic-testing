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

    public Boolean isSpacialChar(String name) {
        if (!name.matches("[a-zA-Z.? ]*")) {
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
}
