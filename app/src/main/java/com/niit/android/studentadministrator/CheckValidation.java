package com.niit.android.studentadministrator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 20124899 on 08/10/2015.
 */
public class CheckValidation {
    public boolean checkFullName(String fullName) {
        String USERNAME_PATTERN = "^[a-zA-Z\\sÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ_-]{3,25}$";
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(fullName);
        return matcher.matches();
    }

    public boolean checkEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean checkPhoneNumber(String phoneNumber) {
        String NUMBER_PATTERN = "(^[09]?\\d{10})|(^[01]?\\d{11})";
        Pattern pattern = Pattern.compile(NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}