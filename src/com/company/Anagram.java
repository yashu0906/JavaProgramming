package com.company;
import java.util.TreeSet;

public class Anagram {
    public boolean isAnagram(String[] list){
        boolean flag = false;
        for(int i=0; i<list.length-1; i++){
            if(list[i].length() == list[i+1].length()){
                String str1 = sortCharactersInString(list[i]);
                String str2 = sortCharactersInString(list[i+1]);
              if(str1.equals(str2)){
                  flag = true;
              }else{
                  return false;
              }

            }else{
                return false;
            }
        }
        return flag;
    }
    public String sortCharactersInString(String str){
        TreeSet<Character> set = new TreeSet<>();
        for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }
        return set.toString();
    }
    public static void main(String[] args){
        String[] str = {"abcd","cdba","bcda"};
        Anagram check = new Anagram();
        System.out.println(check.isAnagram(str));
    }
}
