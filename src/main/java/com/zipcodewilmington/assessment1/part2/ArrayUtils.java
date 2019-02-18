package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
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
        int count = 0;
        for (Object object : objectArray) {
            if(object.equals(objectToCount)) {
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
    public static <T> T[] removeValue(T[] objectArray, T objectToRemove) {
        ArrayList<T> list = new ArrayList<T>();
        for (T object : objectArray) {
            if(!object.equals(objectToRemove)) {
                list.add(object);
            }
        }
        T[] array = (T[]) java.lang.reflect.Array.newInstance(list.get(0)
                                                   .getClass(), list.size());
        array = list.toArray(array);
        return array;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        Object resultObject = null;
        int highestNumberOfOccurences = 0;
        for (Object object: objectArray) {
            int numberOfOccurences = getNumberOfOccurrences(objectArray, object);
            if( numberOfOccurences > highestNumberOfOccurences){
                highestNumberOfOccurences = numberOfOccurences;
                resultObject = object;
            }
        }
        return resultObject;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object resultObject = null;
        int leastNumberOfOccurences = Integer.MAX_VALUE;
        for (Object object: objectArray) {
            int numberOfOccurences = getNumberOfOccurrences(objectArray, object);
            if( numberOfOccurences < leastNumberOfOccurences){
                leastNumberOfOccurences = numberOfOccurences;
                resultObject = object;
            }
        }
        return resultObject;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static <T> T[] mergeArrays(T[] objectArray, T[] objectArrayToAdd) {
        T[] resultArray = (T[]) java.lang.reflect.Array.newInstance(objectArray[0]
                                                   .getClass(), objectArray.length + objectArrayToAdd.length);
        
        int resultArrayIndex = 0;
        for (int i = 0; i < objectArray.length; i++) {
            resultArray[resultArrayIndex] = objectArray[i];
            resultArrayIndex++;
        }
        for (int i = 0; i < objectArrayToAdd.length; i++) {
            resultArray[resultArrayIndex] = objectArrayToAdd[i];
            resultArrayIndex++;
        }

        return resultArray;
    }
}
