package easyProblems.TwoSum;//        Given an array of integers nums and an integer target,
//        return indices of the two numbers such that they add up to target.
//        You may assume that each input would have exactly one solution,
//         and you may not use the same element twice.
//        You can return the answer in any order.

/*
Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public  static int[] twoSum(int[] nums, int target) {
        int [] result= new int[2];

        for (int i = 0; i<nums.length; i++)
        {
            for(int j = i+1; j< nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    result[0] = i;
                    result[1] =j;
                    return  result;
                }

            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {

        int target;
        String lineForNumbers;
        String lineForTarget;
        int[] numArray;
        String [] inputArray;
        int [] result;


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter NUmbers: ");
        lineForNumbers = bufferedReader.readLine();
        inputArray = lineForNumbers.split(" ");

        numArray = generateNumArray(inputArray);
        if (numArray == null)
            return;

        System.out.println("Please Enter Target value: ");
        lineForTarget = bufferedReader.readLine();

        try
        {
            target = Integer.parseInt(lineForTarget);
        }
        catch (Exception ex)
        {
            System.out.println("target is not valid integer");
            return;
        }

        if(target <=  -Math.pow(-10,4) || target >=  Math.pow(10,4))
        {
            System.out.println("target is not in the valid range.");
            return;
        }

        result =  twoSum(numArray, target);
        System.out.println("the indices are : " + "num[" +result[0]+"," +result[1] +"]" );
    }

    public static int [] generateNumArray(String [] inputArray)
    {

        int arraySize;
        int[] numArray;

        try
        {
            arraySize = inputArray.length;
        }
        catch (Exception ex)
        {
            System.out.println("target is not valid integer");
            return null;
        }
        if(arraySize < 2 || arraySize > 10000)
        {
            System.out.println("array size is not valid");
            return null;
        }

        numArray = new int[arraySize];
        for (int i = 0 ; i < arraySize; i++)
        {
            try
            {
                numArray[i] =Integer.parseInt(inputArray[i]);
                if (!(numArray[i] >= Math.pow(-10, 9) && numArray[i] <= Math.pow(10,9)))
                {
                    System.out.println("not in valid range for integer array");
                    return null;
                }
            }
            catch (Exception EX)
            {
                System.out.println("input is not in a number format");
                return null;
            }
        }
        return  numArray;
    }


}
