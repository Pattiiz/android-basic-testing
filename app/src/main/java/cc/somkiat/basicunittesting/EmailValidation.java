package cc.somkiat.basicunittesting;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 * Created by phatm on 11/15/2017.
 */

class EmailValidation {

    public boolean isValidEmailFormat(String email) {
        try {
            InternetAddress internetAddress = new InternetAddress(email);
        } catch (AddressException e) {
            return false;
        }
        return true;
    }

    public Boolean isEmpty(String email) {
        if (email.isEmpty()) {
            return false;
        }
        return true;
    }

    public Boolean isNull(String email) {
        if (email == null) {
            return false;
        }
        return true;
    }
}
