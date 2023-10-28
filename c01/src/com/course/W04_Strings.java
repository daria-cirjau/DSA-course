package com.course;

public class W04_Strings {
    public static void reverse(char[] string) {
        for (int i = 0; i < string.length / 2; i++) {
            char temp;
            temp = string[i];
            string[i] = string[string.length - i - 1];
            string[string.length - i - 1] = temp;
        }

        System.out.println(string);
    }

    public static void main(String[] args) {
        reverse(new char[]{'h', 'e', 'l', 'l', 'o'});
        reverse(new char[]{'H', 'a', 'n', 'n', 'a', 'h'});
    }
}
