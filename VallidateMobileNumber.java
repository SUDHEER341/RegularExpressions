package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VallidateMobileNumber {
    public static void main(String[] args) {
        Pattern mypattern = Pattern.compile("(91)\\s[0-9]{10}");
        Matcher mymatch=mypattern.matcher("91 9867234567");
        boolean bool = mymatch.matches();
        System.out.println(bool);
    }
}
