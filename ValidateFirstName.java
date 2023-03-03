package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateFirstName {
    public static void main(String[] args) {
        Pattern myPattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
        Matcher myMath = myPattern.matcher("Sud");
        boolean bool = myMath.matches();
        System.out.println(bool);

    }
}
