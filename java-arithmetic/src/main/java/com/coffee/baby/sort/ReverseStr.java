package com.coffee.baby.sort;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/13 10:26
 **/
public class ReverseStr {


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        boolean reverse = isPalindrome(s);

        System.out.println(s.toLowerCase());

        System.out.println(reverse);
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; ) {
            char ic = s.charAt(i);
            char jc = s.charAt(j);
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ic += ' ';
            }
            if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
                jc += ' ';
            }
            if (!(ic >= 'a' && ic <= 'z' || ic >= '0' && ic <= '9')) {
                i++;
                continue;
            }
            if (!(jc >= 'a' && jc <= 'z' || jc >= '0' && jc <= '9')) {
                j--;
                continue;
            }
            if (jc != ic) return false;
            i++;
            j--;
        }
        return true;
    }
}
