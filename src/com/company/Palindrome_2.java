package com.company;

public class Palindrome_2 {
    public boolean isPalindrome(int num){
        String str = Integer.toString(num);
        for(int i=0,j=str.length()-1; i<j; i++, j--)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Palindrome_2 result = new Palindrome_2();
        System.out.println(result.isPalindrome(121));
    }
}
