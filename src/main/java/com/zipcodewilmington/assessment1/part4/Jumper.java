package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int count =0;
        int step = k < j ? k : j; // step is the shorter one
        int end =  k > j ? k : j; // end is the longer integer
        int outerLoop =0;
        for (; outerLoop < end; outerLoop+=step) {
            count++;
       }
       if(outerLoop > end + 1)// consider last short jump
           count++;
        return count;

    }
}
