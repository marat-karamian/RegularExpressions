package com.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^(https?)?(://)?[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("https://google.com");
        System.out.println(matcher.find());
    }
}
