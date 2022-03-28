package com.company;

public class PalindromeNumber {
    public boolean palindrome(int num){
        String b = "";
        String a = Integer.toString(num);
        for(int i=a.length()-1; i>=0; i--){
            b += a.charAt(i);
        }
        if(a.equals(b)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        PalindromeNumber num = new PalindromeNumber();
        System.out.println(num.palindrome(123));
    }
}
