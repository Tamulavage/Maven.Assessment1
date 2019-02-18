package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer retVal = 0;

        for(Integer ele: intArray){
            retVal = retVal + ele;
        }

        return retVal;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray){
    Integer retVal = 1;

        for(Integer ele: intArray){
        retVal = retVal * ele;
    }

        return retVal;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Integer len = intArray.length;
        Integer sum = getSum(intArray);



        return (double)sum/len;
    }
}
