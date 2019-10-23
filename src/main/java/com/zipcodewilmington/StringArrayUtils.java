package com.zipcodewilmington;

import java.util.*;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        Boolean doesContain = false;

        for (String s : array) {
            if (s.equals(value)) ;
            doesContain = true;
        }

        return doesContain;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        List<String> listOfProducts = Arrays.asList(array);
        Collections.reverse(listOfProducts);
        String[] reversed = listOfProducts.toArray(array);
        return reversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        Integer length = array.length;

        for (int i = 0; i < array.length; i++) {
            String start = array[i];
            String end = array[--length];

            if (length < i) {
                return true;
            }
            if (!start.equals(end)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        Integer valueCount = 0;

        for (String s : array) {
            if (s.equalsIgnoreCase(value)) {
                valueCount += 1;
            }
        }
        return valueCount;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

    return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        //create a stringbuilder object
        StringBuilder sb = new StringBuilder();
        //begin iteration
        for (int i = 0; i < array.length; i++) {
            //append first element to sb
            if (i == 0) {
                sb.append(array[i]);
            }
            //if element matches previous element, append to sb
            else if (array[i] == array[i - 1]) {
                sb.append(array[i]);
            }
            //if element does not match previous element, append space + element to sb
            else {
                sb.append(" " + array[i]);
            }
            //return sb as array

        }
        return sb.toString().split(" ");

    }
}
        /* StringBuilder sb = new StringBuilder();
        ArrayList<String> newList = new ArrayList(Arrays.asList(array));

        for (int i = 1 ; i < newList.size() ; i++) {
            if (newList.get(i).equals(newList.get(i-1))) {
                sb.append(newList.get(i));
            }
        }

        if (newList.get(newList.size()-1).equals(newList.get(newList.size()-2))) {
            sb.append(newList.get(newList.size()-1));

        }

        for (int i = 1 ; i < sb.toString().length() ; i++) {
            if (sb.toString().charAt(i) != sb.toString().charAt(i-1)) {
                sb.insert(i, " ");
            }
        }

        return (sb.toString()).split(" ");
    }
    */


