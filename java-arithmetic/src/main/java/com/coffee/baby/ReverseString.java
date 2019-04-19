package com.coffee.baby;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/3/11 16:50
 **/
public class ReverseString {
    public static void main(String[] args) {

        String s = "hello";
        String result = reverseString(s);
        System.out.println(result);

        char[] chars = {'h', 'e','l', 'l', 'o'};
        char[] resChars = reverseChars(chars);
        System.out.println(resChars);
    }

    public static String reverseString (String s) {

        if (s == null || s.length()==0)
        return s;

        String result = "";
        int length = s.length();
        for (int i=0; i<length; i++) {
            result = s.charAt(i) + result;
        }

        return result;
    }

    public static char[] reverseChars (char[] chars) {

        char [] result = new char[chars.length];

        for (int i=chars.length-1; i>=0; i--) {
            result[(chars.length-i-1)] = chars[i];
        }

        return result;
    }
}
