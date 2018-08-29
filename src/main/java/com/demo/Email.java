package com.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");

        Matcher matcher = pattern.matcher("test@test.com");

        System.out.println(matcher.find());
    }
}
