package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String temp;
        StringBuilder sb = new StringBuilder();

        temp =str.substring(0,1);

        sb.append(temp.toUpperCase());
        sb.append(str.substring(1));

        return sb.toString();


 // Actual Camel case Code
        /*
        String[] splitString = str.split(" ");
        StringBuilder sb = new StringBuilder();
        String temp = "";

        for(String ele: splitString){
            temp = "" + ele.charAt(0);  // get first char - convert back to string
            temp = temp.toUpperCase(); // convert first character to upper
            // appened first char to rest of string plus space
            sb.append(temp);
            for(int i=1; i<ele.length();i++){
                sb.append(ele.charAt(i));
            }

            sb.append(" ");

        }

        sb.deleteCharAt(sb.length()-1); // Remove last space
        sb.toString();

        return sb.toString();
        */
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();


        return sb.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        str = reverse(str);
        str = camelCase(str);
        return str;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1,(str.length()-1));
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        StringBuilder sb = new StringBuilder();
        int len = str.length();
        char checkCase ;
        String temp = "";

        for(int i = 0; i<len; i++){
            checkCase = str.charAt(i);
            if(checkCase >= 'a' && checkCase <= 'z'){
                temp=""+checkCase;
                temp = temp.toUpperCase();
                sb.append(temp);
            }
            else {
                temp=""+checkCase;
                temp = temp.toLowerCase();
                sb.append(temp);
            }


        }

        return sb.toString();
    }
}
