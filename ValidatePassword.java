package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
    public static void main(String[] args) {
        Pattern mypattern =Pattern.compile("[A-Z]{1}[a-z]{6}[@][0-9]{1}");
        Matcher mymatch =mypattern.matcher("Abcdefg@2");
        boolean bool = mymatch.matches();
        System.out.println(bool);
    }
}
