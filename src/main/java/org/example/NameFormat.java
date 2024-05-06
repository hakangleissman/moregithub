package org.example;

public class NameFormat {

    public String toNameFormat(String input) {
        return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
    }

    public boolean toNameFormatBoolean(String input) {
       return !toNameFormat(input).startsWith(input.substring(0,1).toLowerCase());
    }
}
