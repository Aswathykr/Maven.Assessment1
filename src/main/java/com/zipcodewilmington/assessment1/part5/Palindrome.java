package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int count =0;
        for (int i = 2; i <= input.length(); i++) {
            for(int j = 0; j <= input.length()- i;j++){
                String subStr = input.substring(j, j+i);
                if(isPalindrome(subStr))
                    count++;
            }
        }
        return count + input.length();
    }

    public boolean isPalindrome(String input){
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().equals(input);
    }
}
