package com.company;

public class LongestCommonPrefix {
    public String prefix(String[] str){
        String prefix = "";
        int index=0;
        while(true){
            char ch = str[0].charAt(index);
            for(int i=0; i<str.length; i++){
                if(index>=str[i].length()){
                    return prefix;
                }
                if(ch != str[i].charAt(index)){
                    return prefix;
                }
            }
            prefix+=ch;
            index++;
        }
    }
    public static void main(String[] args){

        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] str = {"flow","flight","flower"};
        System.out.println(prefix.prefix(str));

    }
}
