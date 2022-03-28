package com.company;

import java.util.HashMap;
/*
* For example, 2 is written as II in Roman numeral, just two one's added together.
* 12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
*  which is XX + V + II.
*
* */

public class RomanToInteger {
    public int romanToInteger(String s){
        String str = s.toUpperCase();
        int num = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=str.length()-1; i>=0; i--){
            if(i==str.length()-1){
                num+=map.get(str.charAt(i));
            }else{
                if(map.get(str.charAt(i))>=map.get(str.charAt(i+1))){
                    num+=map.get(str.charAt(i));
                }else{
                    num-=map.get(str.charAt(i));
                }
            }
        }
        return num;
    }
    public static void main(String[] args){
        RomanToInteger num = new RomanToInteger();
        System.out.println(num.romanToInteger("XXIV"));
    }
}
