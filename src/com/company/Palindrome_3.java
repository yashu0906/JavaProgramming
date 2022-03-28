package com.company;

public class Palindrome_3 {
    public boolean isPalindrome(int num){
        int reminder=0, reversed = 0, originalnum = num;
        while(num>0){
            reminder = num%10;
            reversed = reversed*10+reminder;
            num = num/10;
        }
        if(originalnum == reversed){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Palindrome_3 result = new Palindrome_3();
        System.out.println(result.isPalindrome(124));
    }
}
