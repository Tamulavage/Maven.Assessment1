package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        Integer count = 0;

        int lengthOfString = input.length() ;
        for (int i = 0; i<lengthOfString; i++)
        {
            // create subtrings
            String temp="";
            for(int j = i; j<lengthOfString; j++){
                // increaase by outer index to skip the ones it already checked
                temp = temp+input.charAt(j);
                // check each substring
                if(isPalindrome(temp) == true){
                    // if true, increase count
                    count++;
                }


            }
        }

        return count;




    }

    boolean isPalindrome(String substr){

        for(int i = 0; i< substr.length(); i++){
            // Loop through substring
            if(substr.charAt(i)!= substr.charAt(substr.length()-i-1))
                // if index does not equal its ending counterpart, return cals
                return false;
        }
        return true; // the substring is  Palindrome
    }
}
