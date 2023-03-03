package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLastName {
    public static void main(String[] args) {
        Pattern myPattern = Pattern.compile("[A-Z]{1}[a-z]{2,}\\s[A-Z]{1}[a-z]{2,}");
        Matcher mymatch = myPattern.matcher("Sudheer Kumar");
        boolean bool =mymatch.matches();
        System.out.println(bool);

    }
}
