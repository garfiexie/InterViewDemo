package com.ctrip.hotel.test.leetcodeDaily.month08.d0812;

import java.util.ArrayList;
import java.util.List;

public class MagicDictionary {
    String[] strings;
    public MagicDictionary() {
        strings = null;
    }

    public void buildDict(String[] dictionary) {
        this.strings = dictionary;
    }

    public boolean search(String searchWord) {
        for (int i=0;i<strings.length;i++){
            int count = 0;
            String s = strings[i];
            if (searchWord.length() !=s.length()){
                continue;
            }
            for (int j=0;j<s.length();j++){
                if (s.charAt(j) !=searchWord.charAt(j)){
                    count++;
                }
                if (count>1){
                    break;
                }
            }
            if (count==1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        MagicDictionary magicDictionary = new MagicDictionary();
        String[] str = {"hello","hallo","leetcode"};
        magicDictionary.buildDict(str);
        magicDictionary.search("leetcodd");
        magicDictionary.search("hello");
    }
}
