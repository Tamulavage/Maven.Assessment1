package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        Integer count = 0;

        for(int i = 0; i < objectArray.length; i++){
            if(objectArray[i].equals(objectToCount)) {
                count++;
            }
        }


        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {


        ArrayList<Object>  tempArrayList = new ArrayList<>();
        for(int i =0; i<objectArray.length;i++) {
            if(objectArray[i].equals(objectToRemove))
            {
                // do nothing
            }
            else
            {
                tempArrayList.add(objectArray[i]);
            }

        }

        // convert back to object array
        int size = tempArrayList.size();
       Integer[] retVal = new Integer[size];
        tempArrayList.toArray(retVal);
      //  Object[] retVal = tempArrayList.toArray();
        return  retVal;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        int currentCount = 0;
        int highCountIndex = 0;
        int highCountAmount = 0;

        for(int index=0; index < objectArray.length;index++ ){
            currentCount = getNumberOfOccurrences(objectArray, objectArray[index]);
            if(currentCount>highCountAmount) {
                highCountAmount = currentCount;
                highCountIndex = index;
            }
        }

        return objectArray[highCountIndex];
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int currentCount = 0;
        int lowCountIndex = 0;
        int lowCountAmount = 1000;

        for(int index=0; index < objectArray.length;index++ ){
            currentCount = getNumberOfOccurrences(objectArray, objectArray[index]);
            if(currentCount<lowCountAmount) {
                lowCountAmount = currentCount;
                lowCountIndex = index;
            }
        }

        return objectArray[lowCountIndex];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

       Integer len1 = objectArray.length ;
       Integer len2 = objectArrayToAdd.length ;
       int size = len1+len2;


        ArrayList<Object>  tempArrayList = new ArrayList<>();

        for(int i=0; i< objectArray.length; i++) {
            tempArrayList.add( objectArray[i]);
        }

        for(int j=0; j<objectArrayToAdd.length; j++) {
            tempArrayList.add( objectArrayToAdd[j]);
        }

        Integer[] retVal = new Integer[size];
        tempArrayList.toArray(retVal);

       return retVal;
    }
}
