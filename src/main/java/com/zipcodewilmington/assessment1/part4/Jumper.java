package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j){

        int countOfJumps = 0;
        int kJumps = 0;
        int step1Jumps = 0;

        // if 1 unit > max of jumps = set ret val to k
        if ( j > k)
        {
            countOfJumps = k;
        }
        else if (k%j == 0)  // check for equal counts
        {
            countOfJumps = k/j;
        }
        else {
            step1Jumps = k%j;
            kJumps = k/j;
            countOfJumps = step1Jumps+kJumps;
        }




    return countOfJumps;
    }
}
