package com.gla.string.level1;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        int length = getNullStringLength();
        System.out.println("Length: " + length);
    }

    private static int getNullStringLength() {
        String text = null;
        return text == null ? 0 : text.length();
    }
}

