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
}
